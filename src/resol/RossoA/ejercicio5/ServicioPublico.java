package resol.RossoA.ejercicio5;

import java.time.LocalDate;

public class ServicioPublico extends Cliente {
    public ServicioPublico(String nombre, String dni, LocalDate fechaPrestamo, double montoSolicitado, LocalDate fechaPactadaPago) {
        super(nombre, dni, fechaPrestamo, montoSolicitado, fechaPactadaPago);
    }
    public double calcularInteres(double monto, int meses) { return monto * 0.10 * meses; }
    public String getTipo() { return "Presta servicios publicos"; }
}
