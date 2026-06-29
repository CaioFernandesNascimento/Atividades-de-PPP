public class AcaoBroker {
    public void comprar(Acao acao, Investidor investidor) {
        System.out.println("Broker: comprando ação " + acao.getNome() + " para " + investidor.getNome());
    }

    public void vender(Acao acao, Investidor investidor) {
        System.out.println("Broker: vendendo ação " + acao.getNome() + " para " + investidor.getNome());
    }
}
