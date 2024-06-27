package br.com.paulos3r.screenmatch.modelo;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FilmeApi {
  private String endereco = "https://www.omdbapi.com/?t=";
  private String chave = "&apikey=1801fb5f";

  public TituloOMDB buscaFilme(String busca){

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    URI filme = URI.create(endereco + busca + chave);

    HttpRequest request = HttpRequest.newBuilder()
            .uri(filme)
            .build();

    try {
      HttpResponse<String> response = HttpClient
              .newHttpClient()
              .send(request, HttpResponse.BodyHandlers.ofString());
      return gson.fromJson(response.body(), TituloOMDB.class);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

  }
}
