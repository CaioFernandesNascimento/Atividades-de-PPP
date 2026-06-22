public class CarroFachada {
    public Motor motor;
    public CintoDeSeguranca cinto;
    public Porta portas;
    public Farol farol;
    public Radio radio;

    // "monta" a fachada do carro
    public CarroFachada(Motor motor, CintoDeSeguranca cinto, Porta portas, Farol farol, Radio radio) {
        this.motor = motor;
        this.cinto = cinto;
        this.portas = portas;
        this.farol = farol;
        this.radio = radio;
    }
    // rotina
    public void iniciarCorrida(String estacaoPreferida) {
        System.out.println("\n--- Preparando para iniciar ---");
        motor.ligar();
        portas.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(estacaoPreferida);
        System.out.println("A viagem começou");
    }
    // rotina
    public void finalizarCorrida() {
        System.out.println("\n--- Finalizando ---");
        motor.desligar();
        portas.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
        System.out.println("Carro desligado");
    }
}
