package br.com.paulos3r.screenmatch.buscadorCep;

public record Endereco (String logradouro,
                        String complemento,
                        String bairro,
                        String localidade,
                        String uf,
                        String cep) {}