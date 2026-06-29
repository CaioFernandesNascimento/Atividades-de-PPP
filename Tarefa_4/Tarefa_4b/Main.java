public class Main {

    public static void main (String[] args){
        Item soda = new Item("Soda", 10.50);
        Item bala = new Item("Bala", 10.50);
        Item chocolate = new Item("Chocolate", 10.50);

        PagamentoStrategy pagamento = new PixPagamento();
        FreteStrategy frete = new FreteCorreio();
        CarrinhoCompras carrinho = new CarrinhoCompras(pagamento, frete);

        carrinho.adicionaItem(soda);
        carrinho.adicionaItem(bala);
        carrinho.adicionaItem(chocolate);

        carrinho.listaCarrinho();

        carrinho.calculaTotal();
        carrinho.calculaFrete(10.0);
        carrinho.realizaPagamento();
        
    }
}
