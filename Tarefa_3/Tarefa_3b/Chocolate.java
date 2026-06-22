public class Chocolate extends AdicionalDecorator {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " e raspas de Chocolate";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 3.00;
    }
}