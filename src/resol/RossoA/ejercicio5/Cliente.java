package resol.RossoA.ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Cliente implements PrestamoCalculable {
    private String nombre;
    private String dni;
    private LocalDate fechaPrestamo;
    private double montoSolicitado;
    private LocalDate fechaPactadaPago;

    public Cliente(String nombre, String dni, LocalDate fechaPrestamo, double montoSolicitado, LocalDate fechaPactadaPago) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaPrestamo = fechaPrestamo;
        this.montoSolicitado = montoSolicitado;
        this.fechaPactadaPago = fechaPactadaPago;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public double getMontoSolicitado() { return montoSolicitado; }
    public LocalDate getFechaPactadaPago() { return fechaPactadaPago; }
    public abstract String getTipo();

    public void mostrarInformacion(LocalDate fechaEfectivaPago, int meses) {
        double interes = calcularInteres(montoSolicitado, meses);
        long diasAtraso = 0;
        double penalidad = 0;

        if (fechaEfectivaPago.isAfter(fechaPactadaPago)) {
            diasAtraso = ChronoUnit.DAYS.between(fechaPactadaPago, fechaEfectivaPago);
            penalidad = montoSolicitado * 0.02 * diasAtraso;
        }

        double total = montoSolicitado + interes + penalidad;
        System.out.println("Cliente: " + nombre + " | DNI: " + dni + " | Tipo: " + getTipo());
        System.out.println("Monto solicitado: $" + montoSolicitado);
        System.out.println("Fecha prestamo: " + fechaPrestamo);
        System.out.println("Fecha pactada de pago: " + fechaPactadaPago);
        System.out.println("Interes calculado: $" + interes);
        if (diasAtraso > 0) System.out.println("Pago con atraso de " + diasAtraso + " dias. Penalidad: $" + penalidad);
        else System.out.println("Pago en termino. Sin penalidad.");
        System.out.println("Monto final a pagar: $" + total);
        System.out.println();
    }
}
