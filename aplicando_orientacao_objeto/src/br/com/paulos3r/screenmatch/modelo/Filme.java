package br.com.paulos3r.screenmatch.modelo;

public class Filme {
  //Abistracao ( o que é um filme )

  private String nome; // java doc
  private int anoDeLancamento;
  private boolean incluidoNoPlano;
  private double somaAvaliacoes; // encapisulamento
  private int totalDeAvaliacoes;
  private int duracaoEmMinutos;

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
}
