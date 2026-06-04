package resol.RossoA.ejercicio4;

public abstract class Empleado implements Calculable {
    private String nombre;
    private String dni;
    private double sueldoBase;
    private int antiguedad;
    private static int totalEmpleados = 0;

    public Empleado(String nombre, String dni, double sueldoBase, int antiguedad) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
        totalEmpleados++;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public double getSueldoBase() { return sueldoBase; }
    public int getAntiguedad() { return antiguedad; }
    public static int getTotalEmpleados() { return totalEmpleados; }

    public double aplicarBonificacion(double sueldoNeto) {
        if (antiguedad > 15) return sueldoNeto * 1.20;
        if (antiguedad > 10) return sueldoNeto * 1.15;
        if (antiguedad > 5) return sueldoNeto * 1.10;
        return sueldoNeto;
    }

    public abstract void mostrarInformacion();
}
