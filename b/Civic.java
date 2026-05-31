public class Civic implements IVehicle {
    @Override
    public void start() {
        System.out.println("Civic: Motor ligado.");
    }

    @Override
    public void drive() {
        System.out.println("Civic: Em movimento.");
    }

    @Override
    public void stop() {
        System.out.println("Civic: Veículo parado.");
    }
}