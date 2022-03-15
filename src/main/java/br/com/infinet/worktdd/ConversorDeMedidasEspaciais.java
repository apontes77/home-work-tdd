package br.com.infinet.worktdd;

public class ConversorDeMedidasEspaciais {
    public double metrosParaJardas(double valorMetros) {
        return valorMetros * 1.09361;
    }

    public double jardasParaMetros(double valorJardas) {
        return valorJardas * 0.9144;
    }

    public double centimetrosParaPolegadas(double valorCentimetro) {
        return valorCentimetro/2.54;
    }

    public double polegadasParaCentimetro(double valorPolegadas) {
        return valorPolegadas * 2.54;
    }

    public double jardasParaCentimetros(double valorJardas) {
        return valorJardas * 91.44;
    }

    public double centimetrosParaJardas(double valorCentimetros) {
        return valorCentimetros/91.44;
    }
}
