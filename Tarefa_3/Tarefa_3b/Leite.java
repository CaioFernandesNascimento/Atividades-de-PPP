public class Leite extends AdicionalDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Leite";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 2.00;
    }
}