package br.com.paulos3r.screenmatch.principal;

import br.com.paulos3r.screenmatch.modelo.Titulo;
import br.com.paulos3r.screenmatch.modelo.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalApi {
  public static void main(String[] args) throws IOException, InterruptedException {

    Scanner scan = new Scanner(System.in);

    System.out.println("Informe um filme");
    String busca = scan.nextLine();

    String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=1801fb5f";

    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create( endereco ))
            .build();

    HttpResponse<String> response = client
            .send(request,HttpResponse.BodyHandlers.ofString());

    String json = response.body();
    System.out.println(json);

    //Gson gson = new Gson();
    //Titulo titulo = gson.fromJson(json, Titulo.class);

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .create();
    TituloOMDB tituloOMDB = gson.fromJson(json, TituloOMDB.class);

    System.out.println(tituloOMDB);

    Titulo titulo = new Titulo(tituloOMDB);
  }
}
