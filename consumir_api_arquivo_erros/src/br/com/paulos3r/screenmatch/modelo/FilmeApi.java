package br.com.paulos3r.screenmatch.modelo;

public class FilmeApi {
  private String endereco = "https://www.omdbapi.com/?t=";
  private String chave = "&apikey=1801fb5f";
  private String busca;

  public FilmeApi(String busca) {

    this.busca = endereco + busca.replace(" ","+") + chave;
  }
  public String getBusca() {
    return busca;
  }
}
