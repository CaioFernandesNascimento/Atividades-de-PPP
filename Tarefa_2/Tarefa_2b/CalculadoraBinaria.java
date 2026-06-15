public class CalculadoraBinaria {
    public String somar(String a, String b) {
        // bin para int
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int soma = intA + intB;
        return Integer.toBinaryString(soma);
    }

    public String subtrair(String a, String b) {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int subtracao = intA - intB;
        return Integer.toBinaryString(subtracao);
    }
}