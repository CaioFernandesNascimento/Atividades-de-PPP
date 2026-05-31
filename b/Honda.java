public class Honda implements IVehicleMaker {
    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equalsIgnoreCase("Civic")) {
            return new Civic();
        } else if (modelo.equalsIgnoreCase("City")) {
            return new City();
        } else if (modelo.equalsIgnoreCase("Fit")) {
            return new Fit();
        } else {
            return new Civic(); // pra evitar retorna null, se der errado da civic
        }
    }
}

// Usa o padrão Factory para criar os carros sem precisar dar new, mesma coisa na Toyota