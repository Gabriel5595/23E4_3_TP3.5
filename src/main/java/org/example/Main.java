package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // URL da API pública
            String apiUrl = "https://api.publicapis.org/entries";

            // Realiza a requisição HTTP GET
            String resposta = RequisicaoHttp.realizarRequisicao(apiUrl);

            // Cria uma instância da classe Resposta com o JSON obtido
            Resposta respostaObj = new Resposta(resposta);

            // Imprime a resposta
            System.out.println(respostaObj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}