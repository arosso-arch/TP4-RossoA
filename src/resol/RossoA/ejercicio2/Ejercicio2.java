package resol.RossoA.ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void ejecutar() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Toyota", 8000, 4));
        vehiculos.add(new Moto("Honda", 2500, 150));

        System.out.println("\n===== SISTEMA DE VEHICULOS =====");
        for (Vehiculo v : vehiculos) {
            int faltan = v.proximoServicio() - v.getKilometraje();
            System.out.println("Vehiculo: " + v.getMarca());
            System.out.println("Kilometraje actual: " + v.getKilometraje());
            System.out.println("Faltan " + faltan + " km para el service.");
            v.recorrer(faltan);
            System.out.println("Kilometraje luego de recorrer: " + v.getKilometraje());
            if (v.getKilometraje() == v.proximoServicio()) v.realizarRevision();
            System.out.println();
        }
    }
}
