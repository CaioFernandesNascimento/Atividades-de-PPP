import java.util.ArrayList;

public class CarrinhoCompras {
    PagamentoStrategy pagamentoStrategy;
    ArrayList<Item> produtos = new ArrayList<>();
    PagamentoStrategy strategy;

    public CarrinhoCompras(PagamentoStrategy strategy) {
        this.strategy = strategy;
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
        System.out.print("Pagamento finalizado ");
        strategy.tipoPagamento();
    }

    public void listaCarrinho(){
        for (Item produto: produtos){
            System.out.println("Produto:" + produto.toString() + " --------------- Valor: " + produto.getValorItem());
        }
    }

}
