package ejercicio2.servicios;

import ejercicio2.entidades.TemperatureConverter;

public class TemperatureConverterService {

    public double celsiusToFahrenheit(TemperatureConverter tc) {

        return ((double) 9/5)*tc.getTemperature() + 32.0;
    }

    public double fahrenheitToCelsius(TemperatureConverter tc) {

        return ((double) 5/9)*(tc.getTemperature() - 32);
    }

    public double celsiusToKelvin(TemperatureConverter tc) {

        return tc.getTemperature() + 273.15;
    }

    public double kelvinToCelsius(TemperatureConverter tc) {

        return tc.getTemperature() - 273.15;
    }

    public double fahrenheitToKelvin(TemperatureConverter tc) {

        return ((double) 5/9*(tc.getTemperature() - 32)) + 273.15;
    }

    public double kelvinToFahrenheit(TemperatureConverter tc) {

        return ((double) 9/5)*(tc.getTemperature() - 273.15) + 32;
    }
}
