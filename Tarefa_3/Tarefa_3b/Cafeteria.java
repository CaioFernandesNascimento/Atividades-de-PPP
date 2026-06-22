public class Cafeteria {
    public static void main(String[] args) {
        
        System.out.println("=== Pedido 1 ===");
        // Espresso puro
        Bebida pedido1 = new Espresso();
        System.out.println("Bebida: " + pedido1.getDescricao());
        System.out.println("Custo Total: R$ " + String.format("%.2f", pedido1.calculaCusto()));

        System.out.println("\n=== Pedido 2 ===");
        // Decaf com Leite e Canela
        Bebida pedido2 = new Decaf();
        pedido2 = new Leite(pedido2);
        pedido2 = new Canela(pedido2);
        System.out.println("Bebida: " + pedido2.getDescricao());
        System.out.println("Custo Total: R$ " + String.format("%.2f", pedido2.calculaCusto()));

        System.out.println("\n=== Pedido 3 ===");
        //Espresso com Leite e Chocolate
        Bebida pedido3 = new Espresso();
        pedido3 = new Leite(pedido3);
        pedido3 = new Chocolate(pedido3);
        System.out.println("Bebida: " + pedido3.getDescricao());
        System.out.println("Custo Total: R$ " + String.format("%.2f", pedido3.calculaCusto()));
    }
}