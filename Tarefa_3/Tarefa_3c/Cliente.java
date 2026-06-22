public class Cliente {
    public static void main(String[] args) {
        // instancia
        Amplificador amp = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaDePipoca pipoqueira = new MaquinaDePipoca();
        Projetor projetor = new Projetor();
        PlayerDeStreaming player = new PlayerDeStreaming();
        Telao telao = new Telao();

        // fachada
        HomeTheaterFacade meuHomeTheater = new HomeTheaterFacade(
            amp, luzes, pipoqueira, projetor, player, telao
        );

        
        meuHomeTheater.assistirFilme("Minecraft 2");
        meuHomeTheater.fimDoFilme();
    }
}
