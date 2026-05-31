public class Main {
    public static void main(String[] args) {
        // Usa o singleton para fazer as fabricas de carro
        IVehicleMaker toyotaMaker = VehicleMakerSingleton.getToyotaInstance();
        IVehicleMaker hondaMaker = VehicleMakerSingleton.getHondaInstance();

        // Fabrica sem dar "new" um monte de vez
        IVehicle meuCorolla = toyotaMaker.makeVehicle("Corolla");
        IVehicle minhaHilux = toyotaMaker.makeVehicle("Hilux");
        
        IVehicle meuCivic = hondaMaker.makeVehicle("Civic");
        IVehicle meuFit = hondaMaker.makeVehicle("Fit");

        // Testa os carros 
        System.out.println("--- Testando Toyota ---");
        meuCorolla.start();
        meuCorolla.drive();
        minhaHilux.stop();

        System.out.println("\n--- Testando Honda ---");
        meuCivic.start();
        meuCivic.drive();
        meuFit.stop();
    }
}