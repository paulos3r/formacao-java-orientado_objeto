package br.com.paulos3r.screenmatch.principal;

import br.com.paulos3r.screenmatch.excecao.ErrorDeConversaoException;
import br.com.paulos3r.screenmatch.modelo.FilmeApi;
import br.com.paulos3r.screenmatch.modelo.GeradorFile;
import br.com.paulos3r.screenmatch.modelo.Titulo;
import br.com.paulos3r.screenmatch.modelo.TituloOMDB;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalApi {
  public static void main(String[] args) throws IOException, InterruptedException {

    Scanner scan = new Scanner(System.in);
    String busca = "";
    List<Titulo> lista = new ArrayList<>();

    while (!busca.equalsIgnoreCase("sair")) {

      System.out.println("Informe um filme");
      busca = scan.nextLine();

      if (busca.equalsIgnoreCase("sair")){
        break;
      }

      try {
        FilmeApi api = new FilmeApi();
        TituloOMDB tituloOMDB =  api.buscaFilme(busca);
        System.out.println( tituloOMDB );
        Titulo titulo = new Titulo(tituloOMDB);
        lista.add(titulo);

      }catch (NumberFormatException e){
        System.out.println("Erro na conversao");
        System.out.println(e.getMessage());
      }catch (IllegalArgumentException e){
        System.out.println("Argumento invalido, verifica o endereco na busca");
        System.out.println(e.getMessage());
      }catch (ErrorDeConversaoException e){
        System.out.println(e.getMessage());
      }
    }

    GeradorFile gerador = new GeradorFile();
    gerador.GeraJson(lista);
    System.out.println(lista);
  }
}