package br.com.infinet.worktdd;

public class ConversorDeMedidasEspaciais {
    public double metrosParaJardas(double valorMetros) {
        return valorMetros * 1.09361;
    }

    public double jardasParaMetros(double valorJardas) {
        return valorJardas * 0.9144;
    }

    public double centimetrosParaPolegadas(double valorCentimetro) {
        return valorCentimetro * 0.393701;
    }
}
