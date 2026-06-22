public class Main {
    public static void main(String[] args) {
        //instancia 
        Motor motor = new Motor();
        CintoDeSeguranca cinto = new CintoDeSeguranca();
        Porta portas = new Porta();
        Farol farol = new Farol();
        Radio radio = new Radio();
        //fachada
        CarroFachada meuCarro = new CarroFachada(motor, cinto, portas, farol, radio);
        //rotina
        meuCarro.iniciarCorrida("Comercial FM");
        meuCarro.finalizarCorrida();
    }
}
