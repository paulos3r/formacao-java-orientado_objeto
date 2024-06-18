import br.com.paulos3r.screenmatch.modelo.Filme;

public class Principal {
  public static void main(String[] args) {

    Filme filme = new Filme();  // referencia, direita cria espaco na memoria / esquerda guarda a informacao

    filme.setNome("O poderoso chefao");
    filme.setAnoDeLancamento(1972);
    filme.setDuracaoEmMinutos(175);

    filme.exibeFichaTecnica();
    filme.avalia(9);
    filme.avalia(8);
    filme.avalia(9);

    System.out.println( filme.exibeFichaTecnica());

    System.out.println(String.format("Média de avaliações do filme: %.2f", filme.mediaDasAvaliacoes()));
  }
}