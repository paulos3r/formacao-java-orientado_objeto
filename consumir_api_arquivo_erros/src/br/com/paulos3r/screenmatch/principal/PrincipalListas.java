package br.com.paulos3r.screenmatch.principal;

import br.com.paulos3r.screenmatch.modelo.Filme;
import br.com.paulos3r.screenmatch.modelo.Serie;
import br.com.paulos3r.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalListas {
  public static void main(String[] args) {
    Filme filme = new Filme("O poderoso chefao",1972);
    filme.avalia(9);
    Serie serie = new Serie("A Casa do Dragão",2022);
    serie.avalia(8);

    List<Titulo> lista = new ArrayList<>();
    lista.add(filme);
    lista.add(serie);

    for (Titulo item: lista){
      System.out.println(item.getNome());

      if (item instanceof Filme filme1 && filme.getClassificacao() > 2){
        System.out.println("Classificacao" + filme1.getClassificacao());
      }
    }

    ArrayList<String> buscaPorArtistas = new ArrayList<>();

    buscaPorArtistas.add("Adan Sandler");
    buscaPorArtistas.add("Paulo");
    buscaPorArtistas.add("Jaqueline");
    buscaPorArtistas.add("Denis");

    System.out.println("\n####### ANTES DA ORDENACAO #######");
    System.out.println(buscaPorArtistas);

    Collections.sort(buscaPorArtistas);

    System.out.println("\n####### DEPOIS DA ORDENACAO #######");
    System.out.println(buscaPorArtistas);

    System.out.println("\n####### LISTA DE TITULOS ORDENADOS #######");

    // Essa linha e um pouco confusa, pois usa o toString da classe titulo, e tevemos que criar uma extencao na classe titulo
    Collections.sort(lista);
    System.out.println(lista);

    //ordernar pelo ano de lancamento
    lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

    System.out.println("###### ORDENANDO POR ANO ###########");

    System.out.println(lista);
  }
}
