package br.com.alura.principal;

import br.com.alura.componentes.ConversorDeMoeda;
import br.com.alura.componentes.Moeda;

import java.util.Scanner;

/* CLASSE DE TESTE
    Com ela você pode testar o conversor.
    Baste informar a moeda desejada e a moeda para qual você deseja converter!
    Por fim, informe o valor que deseja converter e pronto, a conversão é feita!
 */
public class Teste {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        /*
            Esse é o primeiro exemplo de conversão.
            ele já concatena a moeda desejada e a para qual você quer converter junto também do valor.
            Para alterar as moedas do teste, basta mudar as siglas entre os as aspas:
            Sendo "USD" para a moeda que você deseja, "BRL" para a moeda que você deseja converter e
            100.00 para o valor que você deseja converter.
         */
        ConversorDeMoeda conexao = new ConversorDeMoeda();
        Moeda resposta = conexao.conversor("USD", "BRL", 100.00);
        System.out.println(resposta);

        /*
            Esse é o segundo exemplo de conversão.
            Ele concatena automaticamente as moedas e valores, porém, diferente do exemplo acima, esse
            exemplo interaje com o cliente, o mesmo podem escolher para qual moedas deseja, basta
            digitar no teclado e também, o valor que deseja converter
         */
        System.out.println("Primeira moeda");
        String origem = leitura.nextLine();
        System.out.println(origem);
        System.out.println("Segunda moeda");
        String destino = leitura.nextLine();
        System.out.println(destino);
        System.out.println("Valor");
        double valor = leitura.nextDouble();
        System.out.println(valor);

        Moeda resposta2 = conexao.conversor(origem, destino, valor);
        System.out.println(resposta2);
    }
}
