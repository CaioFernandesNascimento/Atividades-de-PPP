public class Toyota implements IVehicleMaker {
    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equalsIgnoreCase("Corolla")) {
            return new Corolla();
        } else if (modelo.equalsIgnoreCase("Hilux")) {
            return new Hilux();
        } else if (modelo.equalsIgnoreCase("Etios")) {
            return new Etios();
        } else {
            return new Corolla();
        }
    }
}