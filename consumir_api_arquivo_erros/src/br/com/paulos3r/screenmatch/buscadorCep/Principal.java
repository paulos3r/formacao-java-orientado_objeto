package br.com.paulos3r.screenmatch.buscadorCep;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Endereco endereco1;
    ConsultaCep consultaCep = new ConsultaCep();

    System.out.println("Informe numero do cep");
    var cep = scan.nextLine();

    try {
      endereco1 = consultaCep.buscaEndereco(cep);
      System.out.println(endereco1);
      GeradorDeArquivo gerador = new GeradorDeArquivo();
      gerador.geradorJson(endereco1);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
      System.out.println("Finalizando aplicacao");
    }
  }
}
