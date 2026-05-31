public class VehicleMakerSingleton {
    private static IVehicleMaker toyota;
    private static IVehicleMaker honda;

    public static IVehicleMaker getToyotaInstance() {
        if (toyota == null) {
            toyota = new Toyota();
        }
        return toyota;
    }

    public static IVehicleMaker getHondaInstance() {
        if (honda == null) {
            honda = new Honda();
        }
        return honda;
    }
}

// o singleton garante que só tenha uma Honda e uma TOYOTA