package resol.RossoA.ejercicio1;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void ejecutar() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Agustin", 21, 9));
        estudiantes.add(new Estudiante("Santino", 20, 6));
        estudiantes.add(new Estudiante("Lucas", 22, 7));

        System.out.println("\n===== GESTION ACADEMICA =====");
        for (Estudiante e : estudiantes) {
            e.mostrarRol();
            System.out.println(e.generarReporte());
        }
    }
}
