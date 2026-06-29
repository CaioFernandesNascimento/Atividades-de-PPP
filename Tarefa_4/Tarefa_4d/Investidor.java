public class Investidor implements ObserverInvestidor {
    private final String nome;
    private final double limiteMinimo;
    private final double limiteMaximo;
    private final AcaoBroker broker;

    public Investidor(String nome, double limiteMinimo, double limiteMaximo, AcaoBroker broker) {
        this.nome = nome;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.broker = broker;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void atualizarPreco(Acao acao) {
        System.out.println("Notificação para " + nome + ": o preço da ação " + acao.getNome() + " mudou para R$ " + acao.getPreco());

        if (acao.getPreco() >= limiteMaximo) {
            System.out.println(nome + ": Preço máximo");
            broker.vender(acao, this);
        } else if (acao.getPreco() <= limiteMinimo) {
            System.out.println(nome + ": Preço mínimo");
            broker.comprar(acao, this);
        }
    }
}
