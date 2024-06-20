package br.com.paulos3r.screenmatch.calculadora;

public class FiltroRecomendacao {

  public void filtra(Classificavel classificavel){
    if (classificavel.getClassificacao() >= 4){
      System.out.println("Esta entre os preferidos");
    }else if (classificavel.getClassificacao() >= 2 ){
      System.out.println("Filmes show");
    }else{
      System.out.println("Coloque em sua lista para ver depois");
    }
  }
}
