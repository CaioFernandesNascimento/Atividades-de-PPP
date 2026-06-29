public class AeroportoUberlandia implements ObserverCET {
    @Override
    public void atualizar(double temperatura, double umidade, double vento) {
        if (vento > 50.0) {
            System.out.println("AEROPORTO: Rajadas de vento fortes: " + vento + " km/h");
        }
    }
}
