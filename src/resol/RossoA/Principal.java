package resol.RossoA;

import java.util.Scanner;
import resol.RossoA.ejercicio1.Ejercicio1;
import resol.RossoA.ejercicio2.Ejercicio2;
import resol.RossoA.ejercicio3.Ejercicio3;
import resol.RossoA.ejercicio4.Ejercicio4;
import resol.RossoA.ejercicio5.Ejercicio5;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== TRABAJO PRACTICO 4 =====");
            System.out.println("1. Ejercicio 1 - Gestion Academica");
            System.out.println("2. Ejercicio 2 - Sistema de Vehiculos");
            System.out.println("3. Ejercicio 3 - Sistema Bancario");
            System.out.println("4. Ejercicio 4 - Gestion de Empleados");
            System.out.println("5. Ejercicio 5 - Prestamos Bancarios");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: Ejercicio1.ejecutar(); break;
                case 2: Ejercicio2.ejecutar(); break;
                case 3: Ejercicio3.ejecutar(); break;
                case 4: Ejercicio4.ejecutar(); break;
                case 5: Ejercicio5.ejecutar(); break;
                case 0: System.out.println("Programa finalizado."); break;
                default: System.out.println("Opcion incorrecta.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
