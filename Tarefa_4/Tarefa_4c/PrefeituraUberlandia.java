public class PrefeituraUberlandia implements ObserverCET {
    @Override
    public void atualizar(double temperatura, double umidade, double vento) {
        if (umidade < 30.0) {
            System.out.println("PREFEITURA: Alerta da Defesa Civil, humidade relativa do ar crítica: " + umidade + "%");
        }
    }
}
