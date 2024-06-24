package br.com.paulos3r.screenmatch.modelo;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

  @SerializedName("Title")
  private String nome;

  @SerializedName("Year")
  private int anoDeLancamento;

  private boolean incluidoNoPlano;
  private double somaAvaliacoes;
  private int totalDeAvaliacoes;
  private int duracaoEmMinutos;

  public Titulo(String nome, int anoDeLancamento) {
    this.nome = nome;
    this.anoDeLancamento = anoDeLancamento;
  }

  public Titulo(TituloOMDB tituloOMDB) {
    this.nome = tituloOMDB.title();
    this.anoDeLancamento = Integer.valueOf(tituloOMDB.year());
    this.duracaoEmMinutos = Integer.valueOf(tituloOMDB.runtime().substring(0,2));
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAnoDeLancamento() {
    return anoDeLancamento;
  }

  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
  }

  public boolean isIncluidoNoPlano() {
    return incluidoNoPlano;
  }

  public void setIncluidoNoPlano(boolean incluidoNoPlano) {
    this.incluidoNoPlano = incluidoNoPlano;
  }

  public int getDuracaoEmMinutos() {
    return duracaoEmMinutos;
  }

  public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public String exibeFichaTecnica(){
    return String.format("""
            Nome : %s
            Ano de lancamento: %d
            Total de Avaliacao: %d
            Duracao do filme: %d Minutos
            """, this.nome, this.anoDeLancamento, this.totalDeAvaliacoes, this.duracaoEmMinutos);
  }

  public void avalia(double nota){
    this.somaAvaliacoes+=nota;
    this.totalDeAvaliacoes++;
  }

  public double mediaDasAvaliacoes(){
    return this.somaAvaliacoes / this.totalDeAvaliacoes;
  }

  @Override
  public int compareTo(Titulo titulo) {
    return this.getNome().compareTo(titulo.getNome());
  }

  /*
  * FORMA DE COMPARAR DECRESCENTE
  @Override
  public int compareTo(Conta outra) {
      if (this.getSaldo() < outra.getSaldo()) {
          return 1;
      } else if (this.getSaldo() > outra.getSaldo()) {
          return -1;
      } else {
          return 0;
      }
  }*/

  @Override
  public String toString() {
    return "Titulo{" +
            "nome='" + nome + '\'' +
            ", anoDeLancamento=" + anoDeLancamento +
//            ", incluidoNoPlano=" + incluidoNoPlano +
//            ", somaAvaliacoes=" + somaAvaliacoes +
//            ", totalDeAvaliacoes=" + totalDeAvaliacoes +
            ", duracaoEmMinutos=" + duracaoEmMinutos +
            '}';
  }
}
