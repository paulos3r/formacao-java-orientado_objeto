public class Condicional {
  public static void main(String[] args) {
    int anoDeLancamento = 2024;
    boolean incluidoPlano = true;
    double media = (9.8 + 6.3 + 8.8) /3;
    String plano = "plus";

    if (anoDeLancamento>=2023){
      System.out.println("Lancamento");
    }else{
      System.out.println("Filme retro");
    }

    if (incluidoPlano == true || plano.equals("plus")){
      System.out.println("Filme liberado");
    }else{
      System.out.println("Filme nao liberado");
    }
  }
}
