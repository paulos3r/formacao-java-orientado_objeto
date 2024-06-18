package br.com.paulos3r.screenmatch.modelo;

public class Serie extends Titulo{
  private int temporadas;
  private boolean ativa;
  private int episodiosPorTemporada;
  private int minutosPorTemporada;

  public int getTemporadas() {
    return temporadas;
  }

  public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
  }

  public boolean isAtiva() {
    return ativa;
  }

  public void setAtiva(boolean ativa) {
    this.ativa = ativa;
  }

  public int getMinutosPorTemporada() {
    return minutosPorTemporada;
  }

  public void setMinutosPorTemporada(int minutosPorTemporada) {
    this.minutosPorTemporada = minutosPorTemporada;
  }

  public int getEpisodiosPorTemporada() {
    return episodiosPorTemporada;
  }

  public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
    this.episodiosPorTemporada = episodiosPorTemporada;
  }

  @Override
  public int getDuracaoEmMinutos() {
    return temporadas * episodiosPorTemporada * minutosPorTemporada;
  }

  @Override
  public String exibeFichaTecnica() {
    return String.format("""
            Nome : %s
            Ano de lancamento: %d
            Total de Avaliacao: %.2f
            Duracao do filme: %d Minutos
            Episodios: %d
            """, getNome(), getAnoDeLancamento(), mediaDasAvaliacoes(),getDuracaoEmMinutos(), getEpisodiosPorTemporada());
  }
}
