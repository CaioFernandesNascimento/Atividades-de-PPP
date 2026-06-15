public class Main {
    public static void main(String[] args) {
        // Instanciamos as classes
        Pato patoDomestico = new PatoDomestico();
        Pavao pavaoAzul = new PavaoAzul();

        // Adaptadores
        Ave avePato = new PatoAdapter(patoDomestico);
        Ave avePavao = new PavaoAdapter(pavaoAzul);

        
        System.out.println("--- Testando a ave Pato ---");
        avePato.emitirSom();
        avePato.voar();

        System.out.println("\n--- Testando a ave Pavão ---");
        avePavao.emitirSom();
        avePavao.voar();
    }
}