package br.com.paulos3r.screenmatch.excecao;

public class ErrorDeConversaoException extends RuntimeException {

  private String mensagem;

  public ErrorDeConversaoException(String mensagem) {
    this.mensagem = mensagem;
  }

  @Override
  public String getMessage() {
    return this.mensagem;
  }
}
