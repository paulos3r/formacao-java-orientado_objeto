package br.com.paulos3r.screenmatch.exercicios;

import java.util.ArrayList;

public class PrincipalExercicio {
  public static void main(String[] args) {
    ArrayList<Pessoa> pessoas = new ArrayList<>();

    Pessoa pessoa0 = new Pessoa();
    pessoa0.setNome("Paulo");
    pessoa0.setIdade(15);

    pessoas.add(pessoa0);

    Pessoa pessoa1 = new Pessoa();
    pessoa1.setNome("Jose");
    pessoa1.setIdade(14);

    pessoas.add(pessoa1);

    Pessoa pessoa2 = new Pessoa();
    pessoa2.setNome("Luiz");
    pessoa2.setIdade(20);

    pessoas.add(pessoa2);

    System.out.println("Total de Pessoas: " +pessoas.size());

    System.out.println(pessoas.get(0).toString()); // Paulo

    System.out.println(pessoas.toString()); // total da lista
  }
}
