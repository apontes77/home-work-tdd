package br.com.infnet.worktdd;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorDeMedidasEspaciais {
    public double metrosParaJardas(double valorMetros) {
        Double result = valorMetros * 1.09361;
        return geraPrecisaoComDuasCasasDecimais(result);
    }

    public double jardasParaMetros(double valorJardas) {
        Double result = valorJardas * 0.9144;

        return geraPrecisaoComDuasCasasDecimais(result);
    }

    public double centimetrosParaPolegadas(double valorCentimetro) {
        Double result = valorCentimetro / 2.54;
        return geraPrecisaoComDuasCasasDecimais(result);
    }

    public double polegadasParaCentimetro(double valorPolegadas) {
        Double result = valorPolegadas * 2.54;
        return geraPrecisaoComDuasCasasDecimais(result);
    }

    public double jardasParaCentimetros(double valorJardas) {
        Double result = valorJardas * 91.44;

        return geraPrecisaoComDuasCasasDecimais(result);
    }

    public double centimetrosParaJardas(double valorCentimetros) {
        Double result = valorCentimetros / 91.44;
        return geraPrecisaoComDuasCasasDecimais(result);
    }

    private double geraPrecisaoComDuasCasasDecimais(double result) {
        return BigDecimal.valueOf(result)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
