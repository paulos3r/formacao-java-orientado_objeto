package br.com.paulos3r.screenmatch.modelo;

import br.com.paulos3r.screenmatch.calculadora.Classificavel;

public class Filme extends Titulo implements Classificavel {
  private String diretor;

  public Filme(String nome,int anoDeLancamento){
    super(nome, anoDeLancamento);
  }

  public String getDiretor() {
    return diretor;
  }

  public void setDiretor(String diretor) {
    this.diretor = diretor;
  }

  @Override
  public int getClassificacao() {
    return (int) mediaDasAvaliacoes() /2;
  }

}