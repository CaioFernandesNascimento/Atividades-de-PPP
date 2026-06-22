public class Pizzaria {
    public static void main(String[] args) {
        
        System.out.println("--- Pedido 1 ---");
        
        Pizza marguerita = new MassaFinaPizza();
        marguerita = new Queijo(marguerita);
        marguerita = new Tomate(marguerita);
        
        System.out.println("Descrição: " + marguerita.getDescricao());
        System.out.println("Custo Total: " + marguerita.getCusto());


        System.out.println("\n--- Pedido 2 ---");
        
        Pizza portuguesa = new MassaEspessaPizza();
        portuguesa = new Queijo(portuguesa);
        portuguesa = new Ovo(portuguesa);
        portuguesa = new Tomate(portuguesa);
        
        System.out.println("Descrição: " + portuguesa.getDescricao());
        System.out.println("Custo Total: " + portuguesa.getCusto());
    }
}