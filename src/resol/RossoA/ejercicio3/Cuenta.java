package resol.RossoA.ejercicio3;

public abstract class Cuenta implements Auditable {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            registrarLog("Deposito de $" + monto);
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            registrarLog("Retiro de $" + monto);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
