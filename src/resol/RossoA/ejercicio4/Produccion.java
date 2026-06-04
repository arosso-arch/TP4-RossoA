package resol.RossoA.ejercicio4;

public class Produccion extends Empleado {
    private String turno;

    public Produccion(String nombre, String dni, double sueldoBase, int antiguedad, String turno) {
        super(nombre, dni, sueldoBase, antiguedad);
        this.turno = turno;
    }

    @Override
    public double calcularSalario() {
        double descuento = turno.equalsIgnoreCase("nocturno") ? 0.06 : 0.08;
        double neto = getSueldoBase() - (getSueldoBase() * descuento);
        return aplicarBonificacion(neto);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Produccion: " + getNombre() + " | DNI: " + getDni() + " | Turno: " + turno + " | Salario neto: $" + calcularSalario());
    }
}
