// ExemploDoWhile.java

import java.util.Scanner;

public class ExemploDoWhile2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Adicionando Scanner para entrada de dados
        int combo; // Declarando a variável combo fora do loop
        
        System.out.println("****Lanchonete do Baziotti. Nosso cardápio:****\n");
        System.out.println("[1] Combo #1: X-Salada, Fritas e Refri - R$27,00\n");
        System.out.println("[2] Combo #2: X-Bacon, Fritas e Refri - R$30,00\n");
        System.out.println("[3] Combo #3: X-Tudo, Fritas e Refri - R$33,00\n");
        System.out.println("[4] Combo #4: X-Burger Gourmet, Fritas e Refri - R$35,00\n");
        
        do {
            System.out.print("Digite o número do combo que deseja (1-4) ou 0 para sair: ");
            combo = scanner.nextInt(); // Lendo a entrada do usuário
            
            switch (combo) {
                case 1: {
                    System.out.println("Você escolheu o Combo #1");
                    break;
                }
                case 2: {
                    System.out.println("Você escolheu o Combo #2");
                    break;
                }
                case 3: {
                    System.out.println("Você escolheu o Combo #3");
                    break;
                }
                case 4: {
                    System.out.println("Você escolheu o Combo #4");
                    break;
                }
                case 0: // Opção para sair
                    System.out.println("Obrigado! Até logo!");
                    break;
                default: 
                    System.out.println("Verifique se o número digitado está correto.");
                    System.out.println("Caso você desistiu do pedido, que pena :(. Estamos ansiosos em recebê-lo em breve :)");
            }
        
        } while (combo != 0); // O loop irá continuar até que o usuário digite 0
        
        scanner.close(); // Fechando o scanner
    }
}