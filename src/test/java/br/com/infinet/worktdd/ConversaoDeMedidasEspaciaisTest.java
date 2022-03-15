package br.com.infinet.worktdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversaoDeMedidasEspaciaisTest {

    @Test
    @DisplayName("deve converter metros para jardas")
    void converteMetrosParaJardas() {
        ConversorDeMedidasEspaciais conversorDeMedidasEspaciais = new ConversorDeMedidasEspaciais();
        double valorMetros = 2;
        double metrosParaJardas = conversorDeMedidasEspaciais.metrosParaJardas(valorMetros);
        assertEquals(2.18722, metrosParaJardas);
    }

    @Test
    @DisplayName("deve converter jardas para metros")
    void converteJardasParaMetros() {
        ConversorDeMedidasEspaciais conversorDeMedidasEspaciais = new ConversorDeMedidasEspaciais();
        double valorJardas = 2;
        double jardasParaMetros = conversorDeMedidasEspaciais.jardasParaMetros(valorJardas);
        assertEquals(1.8288, jardasParaMetros);
    }

    @Test
    @DisplayName("deve converter centimetros para polegadas")
    void converteCentimetrosParaPolegadas() {
        ConversorDeMedidasEspaciais conversorDeMedidasEspaciais = new ConversorDeMedidasEspaciais();
        double valorCentimetro = 1;
        double centimetrosParaPolegadas = conversorDeMedidasEspaciais.centimetrosParaPolegadas(valorCentimetro);
        assertEquals(393701, centimetrosParaPolegadas);
    }
}
