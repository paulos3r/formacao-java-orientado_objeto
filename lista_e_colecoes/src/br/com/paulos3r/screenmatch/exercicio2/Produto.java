package br.com.paulos3r.screenmatch.exercicio2;

public class Produto {
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "Produto: " +
            "nome='" + nome + '\'' +
            ", preco=" + preco +
            ", quantidade=" + quantidade + '\n';
  }
}
