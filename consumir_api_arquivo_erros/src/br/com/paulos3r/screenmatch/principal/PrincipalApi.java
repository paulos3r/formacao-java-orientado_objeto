package br.com.paulos3r.screenmatch.principal;

import br.com.paulos3r.screenmatch.excecao.ErrorDeConversaoException;
import br.com.paulos3r.screenmatch.modelo.Titulo;
import br.com.paulos3r.screenmatch.modelo.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalApi {
  public static void main(String[] args) throws IOException, InterruptedException {

    Scanner scan = new Scanner(System.in);
    String busca = "";
    List<Titulo> lista = new ArrayList<>();

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

//    try {
//      File file = new File("d:\\ALURA\\arquivo.json");
//      file.createNewFile();
//
//      while (scan.hasNextLine()) { // hasNextLine() verifica se tem alguma linha para ler
//        String linha = scan.nextLine();
//        System.out.println(linha);
//      }
//      scan.close();
//    }catch (IOException e){
//      System.out.println("Arquivo nao encontrado");
//      e.getMessage();
//      e.printStackTrace();
//    }

    while (!busca.equalsIgnoreCase("sair")) {
      System.out.println("Informe um filme");
      busca = scan.nextLine();

      if (busca.equalsIgnoreCase("sair")){
        break;
      }

      String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ","+") + "&apikey=1801fb5f";
      try {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create( endereco ))
                .build();

        HttpResponse<String> response = client
                .send(request,HttpResponse.BodyHandlers.ofString());

        if(response.statusCode() == 404){
          System.out.println("nao encontrada");
        }

        String json = response.body();
        System.out.println(json);

        TituloOMDB tituloOMDB = gson.fromJson(json, TituloOMDB.class);

        System.out.println(tituloOMDB);


        Titulo titulo = new Titulo(tituloOMDB);
        System.out.println(titulo);

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

    FileWriter escrita = new FileWriter("filmes.json");
    escrita.write(gson.toJson(lista));
    escrita.close();

    System.out.println(lista);
  }
}