public class HomeTheaterFacade {
    public Amplificador amplificador;
    public Luzes luzes;
    public MaquinaDePipoca maquinaDePipoca;
    public Projetor projetor;
    public PlayerDeStreaming player;
    public Telao telao;

    // O construtor recebe todos os equipamentos do subsistema
    public HomeTheaterFacade(Amplificador amp, Luzes luzes, MaquinaDePipoca pipoqueira, 
                             Projetor proj, PlayerDeStreaming player, Telao telao) {
        this.amplificador = amp;
        this.luzes = luzes;
        this.maquinaDePipoca = pipoqueira;
        this.projetor = proj;
        this.player = player;
        this.telao = telao;
    }

    // Letra A) Implementação do ritual
    public void assistirFilme(String filme) {
        System.out.println("\n--- Preparando para assistir filme ---");
        maquinaDePipoca.liga();
        maquinaDePipoca.arrebentaPipoca();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amplificador.liga();
        amplificador.ajustaVolume(10);
        player.liga();
        player.play(filme);
    }

    // Letra B) Proposta e implementação do método fimDoFilme()
    public void fimDoFilme() {
        System.out.println("\n--- O filme acabou ---");
        player.desliga();
        amplificador.desliga();
        projetor.desliga();
        telao.sobe();
        luzes.liga();
        maquinaDePipoca.desliga();
    }
}
