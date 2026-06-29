public class Main {
    public static void main(String[] args) {
        AcaoBroker broker = new AcaoBroker();
        Acao acao = new Acao("PETR4", 10.0);

        Investidor investidor1 = new Investidor("Ana", 8.0, 12.0, broker);
        Investidor investidor2 = new Investidor("Bruno", 9.0, 13.0, broker);

        acao.adicionarInvestidor(investidor1);
        acao.adicionarInvestidor(investidor2);

        acao.setPreco(11.5);
        acao.setPreco(7.0);
    }
}
