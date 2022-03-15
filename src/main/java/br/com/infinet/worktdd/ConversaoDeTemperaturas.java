package br.com.infinet.worktdd;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversaoDeTemperaturas {

    public Double celsiusToFahrenheit(double tempCelsius) {
        Double result = (tempCelsius * 9 / 5) + 32;

        double value = BigDecimal.valueOf(result)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();

        return value;
    }

    public double fahrenheitToCelsius(double tempFahrenheit) {
       Double result =  (tempFahrenheit - 32.0) * 5 / 9;

        double value = BigDecimal.valueOf(result)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
       return value;
    }

    public double fahrenheitToKelvin(double tempFahrenheit) {

        Double result =  (tempFahrenheit - 32) * 5/9 + 273.15;

        double value = BigDecimal.valueOf(result)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
        return value;
    }

    public double kelvinToFahrenheit(double tempKelvin) {
        Double result =  (tempKelvin - 273.15) * 9/5 + 32;

        double value = BigDecimal.valueOf(result)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
        return value;
    }

    public double kelvinToCelsius(double tempKelvin) {
        Double result = tempKelvin - 273.15;

        double value = BigDecimal.valueOf(result)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
        return value;
    }

    public double celsiusToKelvin(double tempCelsius) {
        Double result = tempCelsius + 273.15;

        double value = BigDecimal.valueOf(result)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
        return value;
    }
}
