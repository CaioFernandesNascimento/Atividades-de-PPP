public class Fit implements IVehicle {
    @Override
    public void start() {
        System.out.println("Fit: Motor ligado.");
    }

    @Override
    public void drive() {
        System.out.println("Fit: Em movimento.");
    }

    @Override
    public void stop() {
        System.out.println("Fit: Veículo parado.");
    }
}