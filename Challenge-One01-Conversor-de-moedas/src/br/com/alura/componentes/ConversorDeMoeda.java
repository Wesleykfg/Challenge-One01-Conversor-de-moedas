package br.com.alura.componentes;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMoeda {
    //Criando endereço
    private String endereco = "https://v6.exchangerate-api.com/v6/15794f5d615cca754f30ae58/pair/";

    public Moeda conversor(String origem, String destino, double valor) {
        //String endereco = "https://v6.exchangerate-api.com/v6/15794f5d615cca754f30ae58" + "/pair/" + origem + "/" + destino
        //        + "/" + valor;
        HttpClient cliente = HttpClient.newHttpClient();
        // editando endereço com as opções do cliente
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(endereco + origem + "/" + destino + "/" + valor))
                .build();
        //Aplicação do Response
        HttpResponse<String> resposta = null;
        try {
            resposta = cliente.send(requisicao,
                    HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Conversão e chamada da Classe moeda para exibição da solicitação do cliente
        Gson gson = new Gson();
        return gson.fromJson(resposta.body(), Moeda.class);
    }
}
