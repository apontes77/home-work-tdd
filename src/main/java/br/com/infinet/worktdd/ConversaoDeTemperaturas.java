package br.com.infinet.worktdd;

public class ConversaoDeTemperaturas {

    public double celsiusToFahrenheit(double tempCelsius) {
        return (tempCelsius * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double tempFahrenheit) {
        return (tempFahrenheit - 32.0) * 5 / 9;
    }

    public double fahrenheitToKelvin(double tempFahrenheit) {
        return (tempFahrenheit - 32) * 5/9 + 273.15;
    }

    public double kelvinToFahrenheit(double tempKelvin) {
        return (tempKelvin - 273.15) * 9/5 + 32;
    }

    public double kelvinToCelsius(double tempKelvin) {
        return tempKelvin - 273.15;
    }

    public double celsiusToKelvin(double tempCelsius) {
        return tempCelsius + 273.15;
    }
}
