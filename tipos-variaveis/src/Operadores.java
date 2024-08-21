public class Operadores {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "LINGUAGEM " + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + "1";

        System.out.println(concatenacao);

        int numero = 5;

        numero = - numero;
        
        System.out.println(numero);

        numero = numero * -1;//Passando o nuúmero para positivo multiplicando-o por -1

        System.out.println(numero);
        
        int num = 5;
        //x repetições

        num++;

        System.out.println(num);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        int a, b;

        a = 5;
        b = 6;

        //Operador Ternário
        String resultado = a==b ?"verdadeiro" : "falso";
        
        //Economiza o seguinte código:
        /*String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";*/

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2; 

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        String nomeUm = "FERNANDO";
        String nomeDois = new String("FERNANDO");

        System.out.println(nomeUm.equals(nomeDois));

        //Operadores Lógicos 
        boolean condicao1 = true;

        boolean condicao2 = false; 

        if(condicao1 && condicao2){
            System.out.println(" as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }

        }
    }

