package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class RequisicaoHttp {
    public static String realizarRequisicao(String apiUrl) throws IOException {
        // Cria a URL
        URL url = new URL(apiUrl);

        // Abre a conexão HTTP
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

        // Configura o método HTTP como GET
        conexao.setRequestMethod("GET");

        // Obtém a resposta
        StringBuilder resposta = new StringBuilder();
        try (BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                resposta.append(linha);
            }
        }

        // Fecha a conexão
        conexao.disconnect();

        return resposta.toString();
    }
}
