package br.com.infinet.worktdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConversaoDeTemperaturasTest {
    @Test
    @DisplayName("deve converter temperatura de Celsius para Fahrenheit")
    void testaCelsiusparaFahrenheit() {
        ConversaoDeTemperaturas conversao = new ConversaoDeTemperaturas();
        double tempCelsius = 30.0;
        double celsiusToFahrenheit = conversao.celsiusToFahrenheit(tempCelsius);
        assertEquals(86.0, celsiusToFahrenheit);
    }

    @Test
    @DisplayName("deve converter temperatura de Fahrenheit para Celsius")
    void testaFahreheitParaCelsius() {
        ConversaoDeTemperaturas conversao = new ConversaoDeTemperaturas();
        double tempFahrenheit = 90;
        double fahrenheitToCelsius = conversao.fahrenheitToCelsius(tempFahrenheit);
        assertEquals(32.22222222222222, fahrenheitToCelsius);
    }

    @Test
    @DisplayName("deve converter temperatura de Fahrenheit para Kelvin")
    void testaFahrenheitParaKelvin() {
        ConversaoDeTemperaturas conversao = new ConversaoDeTemperaturas();
        double tempFahrenheit = 32;
        double fahrenheitToKelvin = conversao.fahrenheitToKelvin(tempFahrenheit);
        assertEquals(273.15, fahrenheitToKelvin);
    }

    @Test
    @DisplayName("deve converter temperatura de Kelvin para Fahrenheit")
    void testaKelvinParaFahrenheit() {
        ConversaoDeTemperaturas conversao = new ConversaoDeTemperaturas();
        double tempKelvin = 0;
        double kelvinToFahrenheit = conversao.kelvinToFahrenheit(tempKelvin);
        assertEquals(-459.66999999999996, kelvinToFahrenheit);
    }

    @Test
    @DisplayName("deve converter temperatura de Kelvin para Celsius")
    void testaKelvinParaCelsius() {
        ConversaoDeTemperaturas conversao = new ConversaoDeTemperaturas();
        double tempKelvin = 0;
        double kelvinToCelsius = conversao.kelvinToCelsius(tempKelvin);
        assertEquals(-273.15, kelvinToCelsius);
    }

    @Test
    @DisplayName("deve converter temperatura de Celsius para Kelvin")
    void testaCelsiusParaKelvin() {
        ConversaoDeTemperaturas conversao = new ConversaoDeTemperaturas();
        double tempCelsius = 0;
        double celsiusToKelvin = conversao.celsiusToKelvin(tempCelsius);
        assertEquals(273.15, celsiusToKelvin);
    }
}
