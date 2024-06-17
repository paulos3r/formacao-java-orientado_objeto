public class Main {
  public static void main(String[] args) {
    /* System.out.println("Processo de compilacao");
    System.out.println(" ");
    System.out.println("1 - Codigo java");
    System.out.println("2 - Compilador java");
    System.out.println("3 - Bytecode / .class");
    System.out.println("4 - JVM [Java virtual machine] executa o bytecode");
    System.out.println("5 - Windows / Linux / Mac");
    */

    String nome = "Filme: Top gun: Maverick";

    int anoDeLancamento = 2022;

    boolean incluidoPlano = true;

    //Media calculada pelas 3 notas aleatorias
    double media = (9.8 + 6.3 + 8.8) /3;
    //caso precisa do numero inteiro cast explicito
    int mediaCast = (int) media;

    String sinopse = "Filme dos anos 80";

    String dadosDoFilme = String.format("""
                                        Nome do filme: %s
                                        Ano de lancamento : %d
                                        Sinopse: %s
                                        Nota do filme: %.2f
                                        """, nome, anoDeLancamento, sinopse,media );
    System.out.println(dadosDoFilme);


    System.out.println(anoDeLancamento + sinopse);
  }
}