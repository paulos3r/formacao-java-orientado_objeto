package br.com.paulos3r.screenmatch.principal;

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

    System.out.println(response.body());
  }
}
