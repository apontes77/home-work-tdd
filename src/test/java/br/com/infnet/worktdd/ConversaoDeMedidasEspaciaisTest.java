package br.com.infnet.worktdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testes de conversão de medidas espaciais")
public class ConversaoDeMedidasEspaciaisTest {

    @Test
    @DisplayName("deve converter metros para jardas")
    void converteMetrosParaJardas() {
        ConversorDeMedidasEspaciais conversorDeMedidasEspaciais = new ConversorDeMedidasEspaciais();
        double valorMetros = 2;
        double metrosParaJardas = conversorDeMedidasEspaciais.metrosParaJardas(valorMetros);
        assertEquals(2.19, metrosParaJardas);
    }

    @Test
    @DisplayName("deve converter jardas para metros")
    void converteJardasParaMetros() {
        ConversorDeMedidasEspaciais conversorDeMedidasEspaciais = new ConversorDeMedidasEspaciais();
        double valorJardas = 2;
        double jardasParaMetros = conversorDeMedidasEspaciais.jardasParaMetros(valorJardas);
        assertEquals(1.83, jardasParaMetros);
    }

    @Test
    @DisplayName("deve converter jardas para centimetros")
    void converteJardasParaCentimetros() {
        ConversorDeMedidasEspaciais conversorDeMedidasEspaciais = new ConversorDeMedidasEspaciais();
        double valorJardas = 1;
        double jardasParaCentimetros = conversorDeMedidasEspaciais.jardasParaCentimetros(valorJardas);
        assertEquals(91.44, jardasParaCentimetros);
    }

    @Test
    @DisplayName("deve converter centimetros para jardas")
    void converteCentimetrosParaJardas() {
        ConversorDeMedidasEspaciais conversorDeMedidasEspaciais = new ConversorDeMedidasEspaciais();
        double valorCentimetros = 1;
        double centimetrosParaJardas = conversorDeMedidasEspaciais.centimetrosParaJardas(valorCentimetros);
        assertEquals(0.01, centimetrosParaJardas);
    }

    @Test
    @DisplayName("deve converter centimetros para polegadas")
    void converteCentimetrosParaPolegadas() {
        ConversorDeMedidasEspaciais conversorDeMedidasEspaciais = new ConversorDeMedidasEspaciais();
        double valorCentimetro = 1;
        double centimetrosParaPolegadas = conversorDeMedidasEspaciais.centimetrosParaPolegadas(valorCentimetro);
        assertEquals(0.39, centimetrosParaPolegadas);
    }

    @Test
    @DisplayName("deve converter centimetros para polegadas")
    void convertePolegadasParaCentimetros() {
        ConversorDeMedidasEspaciais conversorDeMedidasEspaciais = new ConversorDeMedidasEspaciais();
        double valorPolegadas = 1;
        double polegadasParaCentimetro = conversorDeMedidasEspaciais.polegadasParaCentimetro(valorPolegadas);
        assertEquals(2.54, polegadasParaCentimetro);
    }
}
