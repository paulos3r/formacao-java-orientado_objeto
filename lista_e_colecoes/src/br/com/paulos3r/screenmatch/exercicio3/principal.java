package br.com.paulos3r.screenmatch.exercicio3;

import java.util.ArrayList;

public class principal {
  public static void main(String[] args) {

    ArrayList<Object> lista = new ArrayList<>();

    lista.add("arroz");
    lista.add("feijao");
    lista.add("carne");

    lista.forEach(System.out::println);

    Cachorro cachorro = new Cachorro();

    if(cachorro instanceof Animal){
      Animal animal = (Animal) cachorro;
    }

    ArrayList<Produto> produtos = new ArrayList<>();

    Produto produto1 = new Produto("Rodo", 4.50);
    produtos.add(produto1);
    Produto produto2 = new Produto("Saco de lixo", 8.50);
    produtos.add(produto2);
    Produto produto3 = new Produto("Detergente", 1.50);
    produtos.add(produto3);

    double somaPreco = 0;
    for (Produto produto : produtos){
      somaPreco+=produto.getPreco();
    }
    double mediaPreco = somaPreco / produtos.size();

    System.out.println();
  }
}
