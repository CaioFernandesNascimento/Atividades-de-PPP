public abstract class ToppingDecorator implements Pizza {
    public Pizza pizza; 

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }

    @Override
    public double getCusto() {
        return pizza.getCusto();
    }
}