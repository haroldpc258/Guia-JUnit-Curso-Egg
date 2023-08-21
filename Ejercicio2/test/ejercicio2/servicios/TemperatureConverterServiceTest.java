package ejercicio2.servicios;

import ejercicio2.entidades.TemperatureConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterServiceTest {

    TemperatureConverterService tcs;

    @BeforeEach
    void setUp() {
        tcs = new TemperatureConverterService();
    }

    @Test
    void celsiusToFahrenheit() {

        //double temperature = Math.round(tcs.celsiusToFahrenheit(new TemperatureConverter(31))*100) / 100.0;

        assertEquals(87.80, tcs.celsiusToFahrenheit(new TemperatureConverter(31)), 0.1);
    }

    @Test
    void fahrenheitToCelsius() {

        //double temperature = Math.round(tcs.fahrenheitToCelsius(new TemperatureConverter(75))*100) / 100.0;
        assertEquals(23.89, tcs.fahrenheitToCelsius(new TemperatureConverter(75)), 0.1);
    }

    @Test
    void celsiusToKelvin() {

        //double temperature = Math.round(tcs.celsiusToKelvin(new TemperatureConverter(25))*100) / 100.0;
        assertEquals(298.15, tcs.celsiusToKelvin(new TemperatureConverter(25)), 0.1);
    }

    @Test
    void kelvinToCelsius() {

        //double temperature = Math.round(tcs.kelvinToCelsius(new TemperatureConverter(350))*100) / 100.0;
        assertEquals(76.85, tcs.kelvinToCelsius(new TemperatureConverter(350)), 0.1);
    }

    @Test
    void fahrenheitToKelvin() {

        //double temperature = Math.round(tcs.fahrenheitToKelvin(new TemperatureConverter(98.6))*100) / 100.0;
        assertEquals(310.15, tcs.fahrenheitToKelvin(new TemperatureConverter(98.6)), 0.1);
    }

    @Test
    void kelvinToFahrenheit() {

        //double temperature = Math.round(tcs.kelvinToFahrenheit(new TemperatureConverter(400))*100) / 100.0;
        assertEquals(260.33, tcs.kelvinToFahrenheit(new TemperatureConverter(400)), 0.1);
    }
}