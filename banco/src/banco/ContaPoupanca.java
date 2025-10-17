package banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String agencia, int numero, double saldoInicial) {
        super(agencia, numero, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado (sem taxa).");
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-=-=-=- Extrato Conta Poupança -=-=-=-");
        System.out.println("-- Agência: " + getAgencia());
        System.out.println("-- Número: " + getNumero());
        System.out.println("-- Saldo: R$ " + getSaldo());
    }
}
