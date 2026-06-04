package resol.RossoA.ejercicio3;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void ejecutar() {
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        Cuenta cuenta = new CajaAhorro("Agustin", 50000);
        cuentas.add(cuenta);

        System.out.println("\n===== SISTEMA BANCARIO =====");
        cuenta.depositar(15000);
        cuenta.retirar(10000);
        cuenta.retirar(100000);
    }
}
