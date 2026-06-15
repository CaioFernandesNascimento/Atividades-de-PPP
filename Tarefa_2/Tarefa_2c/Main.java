public class Main {
    public static void main(String[] args) {
        // Sensor  ruim
        SensorFahrenheit sensorRuim = new SensorFahrenheit();

        // Adaptador nele
        TermometroCelsius termometro = new SensorAdapter(sensorRuim);

        // funciona
        System.out.println("Resultado: " + termometro.getTemperaturaCelsius() + " graus Celsius.");
    }
}