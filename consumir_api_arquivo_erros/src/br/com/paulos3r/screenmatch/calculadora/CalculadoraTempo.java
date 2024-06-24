package br.com.paulos3r.screenmatch.calculadora;

import br.com.paulos3r.screenmatch.modelo.Titulo;

public class CalculadoraTempo {
  private int tempoTotal=0;

  public int getTempoTotal() {
    return tempoTotal;
  }
  public void inclui(Titulo titulo){
    System.out.println(titulo);
    this.tempoTotal += titulo.getDuracaoEmMinutos();
  }
}
