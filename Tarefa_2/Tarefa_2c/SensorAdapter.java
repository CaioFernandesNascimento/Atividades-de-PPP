public class SensorAdapter implements TermometroCelsius {
    private SensorFahrenheit sensorRuim;

    public SensorAdapter(SensorFahrenheit sensorRuim) {
        this.sensorRuim = sensorRuim;
    }

    @Override
    public double getTemperaturaCelsius() {
        // Pega a temperatura em Fahrenheit
        double fahrenheit = sensorRuim.lerTemperaturaFahrenheit();
        
        // Faz a conversão
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        

        return celsius;
    }
}