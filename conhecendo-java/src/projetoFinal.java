import java.util.Random;
import java.util.Scanner;

public class projetoFinal {
  public static void main(String[] args) {
    //projeto adivinha

    Scanner scan = new Scanner(System.in);
    int numeroAleatorio = new Random().nextInt(100);

    int numeroDoUsuario = 0;
    int tentativas = 0;

    while (tentativas <5) {

      System.out.println("Informe o numero ");
      numeroDoUsuario = scan.nextInt();
      tentativas ++;
      System.out.println(numeroAleatorio + "  " + tentativas);

      if (numeroAleatorio < numeroDoUsuario ){
        System.out.println("Numero é MENOR");
      }else if(numeroAleatorio > numeroDoUsuario){
        System.out.println("Numero é MAIOR");
      }else {
        System.out.println("Parabens voce acertou");
        break;
      }

      if (tentativas == 5){
        System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroAleatorio);
      }
    }
  }
}
