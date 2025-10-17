package banco;

public class CalculadorDeImpostos {

    public void calcular(Tributavel t) {
        double imposto = t.getValorImposto();
        System.out.println("Valor do imposto: R$ " + imposto);
    }
}
