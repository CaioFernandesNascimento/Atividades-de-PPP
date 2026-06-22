public class Ovo extends ToppingDecorator {
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Ovo";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 4.00;
    }
}
// ovo na pizza, deus me livre