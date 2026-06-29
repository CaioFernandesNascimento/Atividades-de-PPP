public class FreteSEDEX implements FreteStrategy {
    @Override
    public double calcula(double distancia) {
        System.out.println("Calculando frete Sedex...");
        return distancia * 3.0; 
    }
}