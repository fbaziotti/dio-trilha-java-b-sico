/**
* <h1>ContaTerminal</h1>
* Projeto qpresenta o nome do cliente, sua agência e conta, seu saldo em conta
* e imprime se está correto ou não.
* <p> 
* <b>Note: </b>Essa documentação tem o intuito de facilitar ao usuário
* as usuabilidades do programa.
* @author  Fernando Baziotti
* @version 1.0
* @since   28/08/2024
*/
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
		 /**
        * Este método é utilizado para somar dois números inteiros
        * @param numeroAgencia este é o primeiro parâmetro do método
        * @param numeroConta este é o segundo parâmetro do método
        */
        
        
        /*
          Classe Scanner permite que o usuário insira dados 
          criando o objeto scanner
        */  
        String nomeCliente = "Fernando Baziotti";
        double saldoConta = 500.18;
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número de sua agência: ");
        String numeroAgencia = scanner.next();
        
        System.out.println("Por favor, digite o número de sua conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " , conta " + numeroConta + " e seu saldo de " + saldoConta + " já está disponível para saque :)");
        
	}
  
}