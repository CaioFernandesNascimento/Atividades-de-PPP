public class FreteCorreio implements FreteStrategy {
    @Override
    public double calcula(double distancia) {
        System.out.println("Calculando frete Correio..");
        return distancia * 1.5; 
    }
}