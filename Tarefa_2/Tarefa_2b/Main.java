public class Main {
    public static void main(String[] args) {
        // Instancia a calculadora
        CalculadoraBinaria calcBinaria = new CalculadoraBinaria();

        System.out.println("--- Testando Operações Binárias ---");
        // 10 + 11 = 101
        System.out.println("Soma Binária (10 + 11): " + calcBinaria.somar("10", "11")); 
        // 111 - 10 = 101 
        System.out.println("Subtração Binária (111 - 10): " + calcBinaria.subtrair("111", "10"));


        System.out.println("\n--- Testando Operações Decimais ---");
        // Calculadora binária dentro do adaptador
        Calculadora calcDecimal = new CalculadoraAdapter(calcBinaria);

        
        System.out.println("Soma Decimal (10 + 20): " + calcDecimal.somar(10, 20)); 
        System.out.println("Subtração Decimal (50 - 15): " + calcDecimal.subtrair(50, 15)); 
        System.out.println("Multiplicação Decimal (4 * 5): " + calcDecimal.multiplicar(4, 5));
    }
}