import java.util.Scanner;

public class Leitura {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe seu filme favorito: ");
    String moves = scan.nextLine();

    System.out.println("Qual ano de lancamento: ");
    int releaseYear = scan.nextInt();

    System.out.println("Qual avaliacao que voce da ao filme: ");
    double assessment = scan.nextDouble();

    System.out.println( String.format(
            """
            Filme: %s
            Ano de Lancamento: %d
            Avaliacao: %.2f
            """,moves,releaseYear, assessment
            )
    );
  }
}
