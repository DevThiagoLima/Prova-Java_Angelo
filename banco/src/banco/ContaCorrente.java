package banco;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(String agencia, int numero, double saldoInicial) {
        super(agencia, numero, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = 1.50; // taxa fixa de operação
        double valorTotal = valor + taxa;
        if (valorTotal <= saldo) {
            saldo -= valorTotal;
            System.out.println("Saque de R$ " + valor + " realizado com taxa de R$" + taxa);
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
            return false;
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-=-=-=- Extrato Conta Corrente -=-=-=-");
        System.out.println("-- Agência: " + getAgencia());
        System.out.println("-- Número: " + getNumero());
        System.out.println("-- Saldo: R$ " + getSaldo());
    }

    @Override
    public double getValorImposto() {
        return this.saldo * 0.01;
    }
}
