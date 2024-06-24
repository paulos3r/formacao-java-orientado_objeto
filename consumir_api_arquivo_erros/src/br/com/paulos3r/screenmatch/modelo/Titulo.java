package br.com.paulos3r.screenmatch.modelo;

public class Titulo implements Comparable<Titulo> {
  private String nome;
  private int anoDeLancamento;
  private boolean incluidoNoPlano;
  private double somaAvaliacoes;
  private int totalDeAvaliacoes;
  private int duracaoEmMinutos;

  public Titulo(String nome, int anoDeLancamento) {
    this.nome = nome;
    this.anoDeLancamento = anoDeLancamento;
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
            ", incluidoNoPlano=" + incluidoNoPlano +
            ", somaAvaliacoes=" + somaAvaliacoes +
            ", totalDeAvaliacoes=" + totalDeAvaliacoes +
            ", duracaoEmMinutos=" + duracaoEmMinutos +
            '}';
  }
}
