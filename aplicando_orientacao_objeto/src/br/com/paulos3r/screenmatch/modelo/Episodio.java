package br.com.paulos3r.screenmatch.modelo;

import br.com.paulos3r.screenmatch.calculadora.Classificavel;

public class Episodio implements Classificavel {
  private int numero;
  private String nome;
  private Serie serie;

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Serie getSerie() {
    return serie;
  }

  public void setSerie(Serie serie) {
    this.serie = serie;
  }

  @Override
  public int getClassificacao() {
    return 0 ;
  }
}
