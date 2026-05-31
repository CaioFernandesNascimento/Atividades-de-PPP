public class Etios implements IVehicle {
    @Override
    public void start() {
        System.out.println("Etios: Motor ligado.");
    }

    @Override
    public void drive() {
        System.out.println("Etios: Em movimento.");
    }

    @Override
    public void stop() {
        System.out.println("Etios: Veículo parado.");
    }
}