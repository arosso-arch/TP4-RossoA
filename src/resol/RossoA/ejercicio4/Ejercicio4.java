package resol.RossoA.ejercicio4;

import java.util.ArrayList;

public class Ejercicio4 {
    public static void ejecutar() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Administrativo("Agustin", "12345678", 300000, 6, true));
        empleados.add(new Produccion("Santino", "87654321", 350000, 12, "nocturno"));

        System.out.println("\n===== GESTION DE EMPLEADOS =====");
        for (Empleado e : empleados) e.mostrarInformacion();
        System.out.println("Total de empleados registrados: " + Empleado.getTotalEmpleados());
    }
}
