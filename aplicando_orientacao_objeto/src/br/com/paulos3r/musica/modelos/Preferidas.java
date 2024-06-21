package br.com.paulos3r.musica.modelos;

public class Preferidas {
  public void inclui(Audio audio){
    if (audio.getClassificacao() >=9) {
      System.out.println(audio.getTitulo() +  " " + "E considerado sucesso e bem avaliado" );
    }else{
      System.out.println(audio.getTitulo() + " " + "Todos estao curtindo falta voce!");
    }
  }
}
