public class Canela extends AdicionalDecorator {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " e Canela";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.00;
    }
}