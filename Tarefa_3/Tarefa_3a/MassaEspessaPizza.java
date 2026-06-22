public class MassaEspessaPizza implements Pizza {
    @Override
    public String getDescricao() {
        return "Massa Espessa";
    }

    @Override
    public double getCusto() {
        return 35.00; // Custo base da massa
    }
}