import java.util.ArrayList;

public class CarrinhoCompras {
    ArrayList<Item> produtos = new ArrayList<>();
    PagamentoStrategy pagamentoStrategy;
    FreteStrategy freteStrategy;

   public CarrinhoCompras(PagamentoStrategy pagamentoStrategy, FreteStrategy freteStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
        this.freteStrategy = freteStrategy;
    }

    public void adicionaItem(Item produto){
        produtos.add(produto);
        //System.out.println("Item adicionado " + produto.toString());
    }
    public void removeItem(Item produto){
        produtos.remove(produto);
        //System.out.println("Item removido" + produto.toString());
    }
    public void calculaTotal(){
        double totalvalor = 0;
        for (Item produto : produtos){
            totalvalor += produto.getValorItem();
        }

        System.out.println("Total: " + totalvalor);
    }
    public void realizaPagamento(){
        System.out.print("Pagamento finalizado: ");
        pagamentoStrategy.tipoPagamento();
    }

    public void calculaFrete(double distancia) {
        double valorFrete = freteStrategy.calcula(distancia);
        System.out.println("Valor do frete: R$ " + valorFrete);
    }

    public void listaCarrinho(){
        for (Item produto: produtos){
            System.out.println("Produto:" + produto.toString() + " --------------- Valor: " + produto.getValorItem());
        }
    }

}
