public class BoletoPagamento implements  PagamentoStrategy{
    @Override
    public void tipoPagamento(){
        System.out.println("pago com Boleto");
    }
}
