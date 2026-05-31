public class Corolla implements IVehicle {
    @Override
    public void start() {
        System.out.println("Corolla: Motor ligado.");
    }

    @Override
    public void drive() {
        System.out.println("Corolla: Em movimento.");
    }

    @Override
    public void stop() {
        System.out.println("Corolla: Veículo parado.");
    }
}