package br.com.paulos3r.screenmatch.modelo;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorFile {
  public void GeraJson(List<Titulo> titulo) throws IOException {

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    FileWriter escrita = new FileWriter("listaFilmes.json");
    escrita.write(gson.toJson(titulo));
    escrita.close();
  }
}
