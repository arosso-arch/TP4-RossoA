package resol.RossoA.ejercicio3;

public class CajaAhorro extends Cuenta {
    public CajaAhorro(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void registrarLog(String mensaje) {
        System.out.println("LOG Caja de Ahorro: " + mensaje + " | Saldo actual: $" + getSaldo());
    }
}
