public class Espresso implements Bebida {
    @Override
    public String getDescricao() {
        return "Café Espresso";
    }

    @Override
    public double calculaCusto() {
        return 5.00; 
    }
}