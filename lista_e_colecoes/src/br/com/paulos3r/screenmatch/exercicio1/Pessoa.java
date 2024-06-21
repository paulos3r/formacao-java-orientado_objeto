package br.com.paulos3r.screenmatch.exercicio1;

public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  @Override
  public String toString() {
    return "#######################\n" + "Nome: " + getNome() + "\n" + "Idade: " + getIdade() + "\n#######################\n";
  }
}
