public class Filme {
  //Abistracao ( o que é um filme )

  String nome;
  int anoDeLancamento;
  boolean incluidoNoPlano;
  double somaAvaliacoes;
  int totalDeAvaliacoes;
  int duracaoEmMinutos;

  public String exibeFichaTecnica(){
    return String.format("""
            Nome : %s
            Ano de lancamento: %d
            Total de Avaliacao: %d
            Duracao do filme: %d Minutos
            """, this.nome, this.anoDeLancamento, this.totalDeAvaliacoes, this.duracaoEmMinutos);
  }

  void avalia(double nota){
    this.somaAvaliacoes+=nota;
    this.totalDeAvaliacoes++;
  }

  double mediaDasAvaliacoes(){
    return this.somaAvaliacoes / this.totalDeAvaliacoes;
  }
}
