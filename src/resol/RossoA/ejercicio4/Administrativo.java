package resol.RossoA.ejercicio4;

public class Administrativo extends Empleado {
    private boolean remoto;

    public Administrativo(String nombre, String dni, double sueldoBase, int antiguedad, boolean remoto) {
        super(nombre, dni, sueldoBase, antiguedad);
        this.remoto = remoto;
    }

    @Override
    public double calcularSalario() {
        double descuento = remoto ? 0.12 : 0.08;
        double neto = getSueldoBase() - (getSueldoBase() * descuento);
        return aplicarBonificacion(neto);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Administrativo: " + getNombre() + " | DNI: " + getDni() + " | Modalidad: " + (remoto ? "Remoto" : "Presencial") + " | Salario neto: $" + calcularSalario());
    }
}
