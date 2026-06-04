package resol.RossoA.ejercicio5;

import java.time.LocalDate;

public class Jubilado extends Cliente {
    public Jubilado(String nombre, String dni, LocalDate fechaPrestamo, double montoSolicitado, LocalDate fechaPactadaPago) {
        super(nombre, dni, fechaPrestamo, montoSolicitado, fechaPactadaPago);
    }
    public double calcularInteres(double monto, int meses) { return monto * 0.08 * meses; }
    public String getTipo() { return "Jubilado"; }
}
