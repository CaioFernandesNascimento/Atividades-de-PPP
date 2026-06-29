public class Main {
    public static void main(String[] args) {
        CET cet = new CET();
        cet.adicionarObservador(new PrefeituraUberlandia());
        cet.adicionarObservador(new AeroportoUberlandia());

        cet.setMedicoes(32.5, 25.0, 55.0);
        cet.setMedicoes(28.0, 40.0, 45.0);
    }
}
