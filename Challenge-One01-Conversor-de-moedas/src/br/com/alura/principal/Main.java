package br.com.alura.principal;

import br.com.alura.componentes.ConversorDeMoeda;
import br.com.alura.componentes.Moeda;

import java.util.Scanner;

//CLASSE PRINCIPAL
public class Main {
    public static void main(String[] args) {
        ConversorDeMoeda conexao = new ConversorDeMoeda();
        //Moeda resposta = conexao.conversor("USD", "BRL", 100.00); -- Exemplo de conversão Dolar para Real
        //System.out.println(resposta);
        //Criando as Variaveis
        Scanner leitura = new Scanner(System.in);
        String origem;
        String destino;
        double valor = 00.0;
        int opcao = 0;
        String telaInicial;
        telaInicial = """
                ****************************************************************
                 #######                                      ######                              ##    #
                 #     #                                      #    #                              ##    #
                 #        #######        #  #######           #    #   #######  #     #           ##    #     #     #     #  ######   #######
                 #######  #              #  #     #           #######  #        ##   ##           ##   ##     #     ##    #  #     #  #     #
                      ##  ####           #  #######           ##    #  ####     # # # #            ## ##      #     # ### #  #     #  #     #
                 #    ##  #        #     #  #     #           ##    #  #        #  #  #             ###       #     #    ##  #     #  #     #
                 #######  #######  #######  #     #           #######  #######  #     #              #        #     #     #  ######   #######
                ****************************************************************
                """;
        String telaOpcoes;
        telaOpcoes = """
                ****************************************************************
                Você está no WesssConversor, uma dos primeiros nomes quando o assunto é conversão de moedas.
                Por Gentileza, informe a opção que deseja: 
                 1) Dólar ==> Real brasileiro
                 2) Real brasileiro ==> Dólar
                 3) Real brasileiro ==> Peso argentino
                 4) Peso argentino ==> Real brasileiro
                 5) Peso chileno ==> Peso colombiano
                 6) Boliviano boliviano ==> Real brasileiro
                 7) Escolha livre
                 8) Sair
                ****************************************************************
                """;
        System.out.println(telaInicial);
        //Criando sistema de repetição
        while (opcao != 8) {
            System.out.println(telaOpcoes);
            //Gerando Menu conforme opção escolhida pelo cliente
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("Por gentileza, informe o valor que deseja convertar");
                double valorDolar = leitura.nextDouble();
                Moeda dolarParaReal = conexao.conversor("USD", "BRL", valorDolar);
                System.out.println(dolarParaReal);
            } else if (opcao == 2) {
                System.out.println("Por gentileza, informe o valor que deseja convertar");
                double valorReal = leitura.nextDouble();
                Moeda realParaDolar = conexao.conversor("BRL", "USD", valorReal);
                System.out.println(realParaDolar);
            } else if (opcao == 3) {
                System.out.println("Por gentileza, informe o valor que deseja convertar");
                double valorRealP = leitura.nextDouble();
                Moeda realParaPesoA = conexao.conversor("BRL", "ARS", valorRealP);
                System.out.println(realParaPesoA);
            } else if (opcao == 4) {
                System.out.println("Por gentileza, informe o valor que deseja convertar");
                double valorPesoA = leitura.nextDouble();
                Moeda pesoAParaReal = conexao.conversor("ARS", "BRL", valorPesoA);
                System.out.println(pesoAParaReal);
            } else if (opcao == 5) {
                System.out.println("Por gentileza, informe o valor que deseja convertar");
                double valorPesoChileno = leitura.nextDouble();
                Moeda pesoChiParaPesoCol = conexao.conversor("CLP", "COP", valorPesoChileno);
                System.out.println(pesoChiParaPesoCol);
            } else if (opcao == 6) {
                System.out.println("Por gentileza, informe o valor que deseja convertar");
                double valorBolivianoB = leitura.nextDouble();
                Moeda bolivianoParaReal = conexao.conversor("BOB", "BRL", valorBolivianoB);
                System.out.println(bolivianoParaReal);
            } else if (opcao == 7) {
                System.out.println("");
                String Pula = leitura.nextLine();
                System.out.println("Por gentileza, informe a moeda que possue");
                String origem2 = leitura.nextLine();
                System.out.println("Por gentileza, informe a moeda para qual deseja converter");
                String destino2 = leitura.nextLine();
                System.out.println("Por gentileza, informe o valor que deseja convertar");
                double valor2 = leitura.nextDouble();
                Moeda respostaLivre = conexao.conversor(origem2, destino2, valor2);
                System.out.println(respostaLivre);
            } else if (opcao == 8) {
                    break;
            } else {
                System.out.println("Opção incorreta! Por gentileza, informe uma opção correta");
            }

        }
        System.out.println("Agradecemos a preferencia, tenha um bom dia!!!");
        //Finalizando Programa
    }
}