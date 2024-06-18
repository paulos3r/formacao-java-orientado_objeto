public class Principal {
  public static void main(String[] args) {

    Filme filme = new Filme();  // referencia, direita cria espaco na memoria / esquerda guarda a informacao

    filme.nome = "O poderoso chefao";
    filme.anoDeLancamento = 1972;
    filme.duracaoEmMinutos = 175;
    filme.incluidoNoPlano = true;

    filme.exibeFichaTecnica();
    filme.avalia(9);
    filme.avalia(8);
    filme.avalia(9);

    System.out.println( filme.exibeFichaTecnica());

    System.out.println(String.format("Média de avaliações do filme: %.2f", filme.mediaDasAvaliacoes()));
  }
}