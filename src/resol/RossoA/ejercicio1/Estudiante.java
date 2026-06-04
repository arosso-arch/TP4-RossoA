package resol.RossoA.ejercicio1;

public class Estudiante extends Persona implements Informable {
    private double notaFinal;

    public Estudiante(String nombre, int edad, double notaFinal) {
        super(nombre, edad);
        setNotaFinal(notaFinal);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public double getNotaFinal() { return notaFinal; }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 10) this.notaFinal = notaFinal;
        else this.notaFinal = 0;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Alumno");
    }

    public boolean promociono() {
        return notaFinal >= 7;
    }

    @Override
    public String generarReporte() {
        String condicion = promociono() ? "Promociono" : "No promociono";
        return "Nombre: " + nombre + " | Edad: " + edad + " | Nota final: " + notaFinal + " | Condicion: " + condicion;
    }
}
