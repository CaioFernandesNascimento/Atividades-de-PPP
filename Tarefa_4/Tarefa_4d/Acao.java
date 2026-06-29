import java.util.ArrayList;
import java.util.List;

public class Acao {
    private final String nome;
    private double preco;
    private final List<ObserverInvestidor> investidores = new ArrayList<>();

    public Acao(String nome, double precoInicial) {
        this.nome = nome;
        this.preco = precoInicial;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void adicionarInvestidor(ObserverInvestidor investidor) {
        investidores.add(investidor);
    }

    public void removerInvestidor(ObserverInvestidor investidor) {
        investidores.remove(investidor);
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
        notificarInvestidores();
    }

    private void notificarInvestidores() {
        for (ObserverInvestidor investidor : investidores) {
            investidor.atualizarPreco(this);
        }
    }
}
