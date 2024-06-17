import java.util.Scanner;

public class Loop {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double mediaAvaliacao = 0;
    double nota = 0;

    for (int i = 0; i <3; i++){
      System.out.println("Qual avaliacao que voce da ao filme: ");
      nota = scan.nextDouble();
      mediaAvaliacao += nota;
    }

    System.out.println( String.format("""
            media de avaliacao: %.2f
            """,(mediaAvaliacao/3)
    ));
  }
}
