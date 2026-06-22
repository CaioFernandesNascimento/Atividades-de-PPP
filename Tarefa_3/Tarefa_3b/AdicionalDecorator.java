public abstract class AdicionalDecorator implements Bebida {
    protected Bebida bebida;

    public AdicionalDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto();
    }
}