public class CalculadoraAdapter implements Calculadora {
    private CalculadoraBinaria calculadoraBinaria;

    public CalculadoraAdapter(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    @Override
    public int somar(int a, int b) {
        // (int) pra (String)
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        
        
        String resultadoBinario = calculadoraBinaria.somar(binA, binB);
        
        // volta (int)
        return Integer.parseInt(resultadoBinario, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        
        String resultadoBinario = calculadoraBinaria.subtrair(binA, binB);
        
        return Integer.parseInt(resultadoBinario, 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
}