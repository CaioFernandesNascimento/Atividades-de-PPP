public class City implements IVehicle {
    @Override
    public void start() {
        System.out.println("City: Motor ligado.");
    }

    @Override
    public void drive() {
        System.out.println("City: Em movimento.");
    }

    @Override
    public void stop() {
        System.out.println("City: Veículo parado.");
    }
}