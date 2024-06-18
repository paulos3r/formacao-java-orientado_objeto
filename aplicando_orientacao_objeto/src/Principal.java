import br.com.paulos3r.screenmatch.calculadora.CalculadoraTempo;
import br.com.paulos3r.screenmatch.modelo.Filme;
import br.com.paulos3r.screenmatch.modelo.Serie;

public class Principal {
  public static void main(String[] args) {

    Filme filme = new Filme();  // referencia, direita cria espaco na memoria / esquerda guarda a informacao

    filme.setNome("O poderoso chefao");
    filme.setAnoDeLancamento(1972);
    filme.setDuracaoEmMinutos(175);
    filme.setDiretor("Francis Ford Coppola");

    CalculadoraTempo caluladora = new CalculadoraTempo();
    caluladora.inclui(filme);


    filme.exibeFichaTecnica();
    filme.avalia(9);
    filme.avalia(8);
    filme.avalia(9);

    System.out.println( filme.exibeFichaTecnica());

    Serie serie = new Serie();

    serie.setNome("A Casa do Dragão");
    serie.setAnoDeLancamento(2022);
    serie.setDuracaoEmMinutos(40);
    serie.setTemporadas(1);
    serie.setAtiva(false);
    caluladora.inclui(serie);

    System.out.println( serie.exibeFichaTecnica());

    System.out.println( "Quantos mimutos de filme da esses dois filmes: " + caluladora.getTempoTotal() + "Minutos");

  }
}