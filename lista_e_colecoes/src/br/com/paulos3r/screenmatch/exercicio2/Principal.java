package br.com.paulos3r.screenmatch.exercicio2;

import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {
    ArrayList<Produto> produtos = new ArrayList<>();

    System.out.println("####### Produtos #######\n");
    Produto produto0 = new Produto("Arroz", 24.19,2 );
    produtos.add(produto0);

    Produto produto1 = new Produto("Feijao", 29.19,4 );
    produtos.add(produto1);

    Produto produto2 = new Produto("Carne", 22.19,6 );
    produtos.add(produto2);

    System.out.println(produtos.toString());

    System.out.println("\n#### Produtos Pereciveis ####");

    ArrayList<ProdutoPerecivel> produtosPereciveis = new ArrayList<>();

    ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Carne", 22.19,6 , "24/06/2024");
    produtosPereciveis.add(produtoPerecivel);

    System.out.println(produtosPereciveis.toString());

  }
}
