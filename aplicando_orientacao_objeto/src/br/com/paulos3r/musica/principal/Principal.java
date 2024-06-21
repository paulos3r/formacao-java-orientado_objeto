package br.com.paulos3r.musica.principal;

import br.com.paulos3r.musica.modelos.Preferidas;
import br.com.paulos3r.musica.modelos.Musica;
import br.com.paulos3r.musica.modelos.Podcast;

public class Principal {
  public static void main(String[] args) {

    Musica musica = new Musica();

    musica.setTitulo("Forever");
    musica.setCantor("kiss");

    for (int i = 0; i < 1000; i++ ){
       musica.reprodiz();
    }

    for (int i = 0; i < 50; i++) {
      musica.curtir();
    }

    Podcast podcast = new Podcast();

    podcast.setTitulo("Bolha dev");
    podcast.setApresentador("Marcus");

    for (int i = 0; i < 1000; i++) {
      podcast.reprodiz();
    }

    for (int i = 0; i < 50; i++) {
      podcast.curtir();
    }

    Preferidas preferidas = new Preferidas();

    preferidas.inclui(musica);
    preferidas.inclui(podcast);
  }
}
