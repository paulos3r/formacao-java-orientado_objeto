package br.com.paulos3r.screenmatch.principal;

import br.com.paulos3r.screenmatch.modelo.Filme;
import br.com.paulos3r.screenmatch.modelo.Serie;
import br.com.paulos3r.screenmatch.modelo.Titulo;

import java.util.ArrayList;

public class PrincipalListas {
  public static void main(String[] args) {
    Filme filme = new Filme("O poderoso chefao",1972);
    filme.avalia(9);
    Serie serie = new Serie("A Casa do Dragão",2022);
    serie.avalia(8);

    ArrayList<Titulo> lista = new ArrayList<>();
    lista.add(filme);
    lista.add(serie);

    for (Titulo item: lista){
      System.out.println(item.getNome());

      if (item instanceof Filme filme1 && filme.getClassificacao() > 2){
        System.out.println("Classificacao" + filme1.getClassificacao());
      }
    }
  }
}
