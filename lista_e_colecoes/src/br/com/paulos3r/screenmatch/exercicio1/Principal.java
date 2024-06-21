package br.com.paulos3r.screenmatch.exercicio1;

import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {
    ArrayList<Pessoa> pessoas = new ArrayList<>();

    Pessoa pessoa0 = new Pessoa("Paulo", 15);
    pessoas.add(pessoa0);

    Pessoa pessoa1 = new Pessoa("Jose",14);
    pessoas.add(pessoa1);

    Pessoa pessoa2 = new Pessoa("Luiz",20);
    pessoas.add(pessoa2);

    System.out.println("Total de Pessoas: " +pessoas.size());

    System.out.println(pessoas.get(0).toString()); // Paulo

    System.out.println(pessoas.toString()); // total da lista
  }
}
