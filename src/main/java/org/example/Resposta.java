package org.example;

public class Resposta {
    private String respostaJson;

    public Resposta(String respostaJson) {
        this.respostaJson = respostaJson;
    }

    @Override
    public String toString() {
        return respostaJson;
    }
}
