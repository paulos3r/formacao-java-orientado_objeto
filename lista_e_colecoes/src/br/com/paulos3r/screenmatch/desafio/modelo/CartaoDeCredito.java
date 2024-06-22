package br.com.paulos3r.screenmatch.desafio.modelo;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
  private double limite;
  private double saldo;
  private List<Compra> compras;

  public CartaoDeCredito(double limite) {
    this.limite = limite;
    this.saldo = limite;
    this.compras = new ArrayList<>();
  }

  public boolean lancaCompra(Compra compra){
    if (this.saldo > compra.getValor()){
      this.saldo -= compra.getValor();
      this.compras.add(compra);
      return true;
    }
    return false;
  }

  public double getLimite() {
    return limite;
  }

  public List<Compra> getCompras() {
    return compras;
  }

  public double getSaldo() {
    return saldo;
  }
}
