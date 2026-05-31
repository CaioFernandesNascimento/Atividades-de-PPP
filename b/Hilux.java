public class Hilux implements IVehicle {
    @Override
    public void start() {
        System.out.println("Hilux: Motor ligado.");
    }

    @Override
    public void drive() {
        System.out.println("Hilux: Em movimento.");
    }

    @Override
    public void stop() {
        System.out.println("Hilux: Veículo parado.");
    }
}