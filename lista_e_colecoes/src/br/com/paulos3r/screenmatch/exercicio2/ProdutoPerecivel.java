package br.com.paulos3r.screenmatch.exercicio2;

public class ProdutoPerecivel extends Produto {

  private String dataValidade;

  public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
    super(nome, preco, quantidade);
    this.dataValidade = dataValidade;
  }

  public String getDataValidade() {
    return dataValidade;
  }

  @Override
  public String toString() {
    return "Produto: " +
            "nome='" + getNome() + '\'' +
            ", preco=" + getPreco() +
            ", quantidade=" + getQuantidade() +
            ", data de validade=" + dataValidade + '\n' ;
  }
}
