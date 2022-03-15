package br.com.infnet.worktdd;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversaoDeTemperaturas {

    public Double celsiusToFahrenheit(double tempCelsius) {
        Double result = (tempCelsius * 9 / 5) + 32;
        return geraPrecisaoComDuasCasasDecimais(result);
    }

    public double fahrenheitToCelsius(double tempFahrenheit) {
       Double result =  (tempFahrenheit - 32.0) * 5 / 9;

       return geraPrecisaoComDuasCasasDecimais(result);
    }

    public double fahrenheitToKelvin(double tempFahrenheit) {

        Double result =  (tempFahrenheit - 32) * 5/9 + 273.15;

        return geraPrecisaoComDuasCasasDecimais(result);
    }

    public double kelvinToFahrenheit(double tempKelvin) {
        Double result =  (tempKelvin - 273.15) * 9/5 + 32;
        return geraPrecisaoComDuasCasasDecimais(result);
    }

    public double kelvinToCelsius(double tempKelvin) {
        Double result = tempKelvin - 273.15;
        return geraPrecisaoComDuasCasasDecimais(result);
    }

    public double celsiusToKelvin(double tempCelsius) {
        Double result = tempCelsius + 273.15;
        return geraPrecisaoComDuasCasasDecimais(result);
    }

    private double geraPrecisaoComDuasCasasDecimais(double result) {
        return BigDecimal.valueOf(result)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
