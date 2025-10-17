package banco;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Thiago Lima", "873.276.-99");

        ContaCorrente cc = new ContaCorrente("0001", 82345, 2000.0);
        ContaPoupanca cp = new ContaPoupanca("0001", 13906, 400.0);

        cliente1.adicionarConta(cc);
        cliente1.adicionarConta(cp);


        cc.depositar(200);
        System.out.println();

        cc.sacar(100);
        cp.sacar(50);
        System.out.println();
        cc.transferir(150, cp);

        System.out.println();
        cc.imprimirExtrato();
        System.out.println();
        cp.imprimirExtrato();


        System.out.println();
        CalculadorDeImpostos calculadora = new CalculadorDeImpostos();
        calculadora.calcular(cc);
    }
}
