package br.com.paulos3r.screenmatch;

import br.com.paulos3r.screenmatch.calculadora.CalculadoraTempo;
import br.com.paulos3r.screenmatch.calculadora.FiltroRecomendacao;
import br.com.paulos3r.screenmatch.modelo.Episodio;
import br.com.paulos3r.screenmatch.modelo.Filme;
import br.com.paulos3r.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {

    Filme filme = new Filme("O poderoso chefao",1972);  // referencia, direita cria espaco na memoria / esquerda guarda a informacao

    filme.setDuracaoEmMinutos(175);
    filme.setDiretor("Francis Ford Coppola");


    ArrayList<Filme> listaDeFilmes = new ArrayList<>();

    listaDeFilmes.add(filme);

    System.out.println(listaDeFilmes.size()); // tamanho da lista
    System.out.println(listaDeFilmes.get(0).getNome()); // primeiro filme da lista 

    CalculadoraTempo caluladora = new CalculadoraTempo();
    caluladora.inclui(filme);


    filme.exibeFichaTecnica();
    filme.avalia(9);
    filme.avalia(8);
    filme.avalia(9);

    System.out.println( filme.exibeFichaTecnica());

    Serie serie = new Serie("A Casa do Dragão",2022);

    serie.setDuracaoEmMinutos(40);
    serie.setTemporadas(1);
    serie.setAtiva(false);
    caluladora.inclui(serie);

    System.out.println( serie.exibeFichaTecnica());

    System.out.println( "Quantos mimutos de filme da esses dois filmes: " + caluladora.getTempoTotal() + "Minutos");

    FiltroRecomendacao filtro = new FiltroRecomendacao();

    filtro.filtra(filme);

    Episodio episodio = new Episodio();

    episodio.setNumero(1);
    episodio.setSerie(serie);
    episodio.setNome(serie.getNome());

    System.out.println(episodio);
  }
}