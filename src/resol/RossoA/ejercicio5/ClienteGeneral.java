package resol.RossoA.ejercicio5;

import java.time.LocalDate;

public class ClienteGeneral extends Cliente {
    public ClienteGeneral(String nombre, String dni, LocalDate fechaPrestamo, double montoSolicitado, LocalDate fechaPactadaPago) {
        super(nombre, dni, fechaPrestamo, montoSolicitado, fechaPactadaPago);
    }
    public double calcularInteres(double monto, int meses) { return monto * 0.15 * meses; }
    public String getTipo() { return "Cliente general"; }
}
