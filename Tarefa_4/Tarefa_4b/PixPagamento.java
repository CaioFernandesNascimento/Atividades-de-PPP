public class PixPagamento implements  PagamentoStrategy{
    @Override
    public void tipoPagamento(){
        System.out.println("pago com pix");
    }
}
