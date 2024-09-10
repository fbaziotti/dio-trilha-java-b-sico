package br.com.dio.desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é maior que parametroDois e lançar exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // Realizar a contagem e imprimir os números
        int quantidade = parametroDois - parametroUm; // Quantidade de interações
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Contando... número: " + i);
        }
    }
}