/*
Métodos: funções ações. Exemplo: classe Carros - método Acelerar
Critérios: verbo no infinitivo, camelCase.

Classe para representar uma SmartTV
1. Características: ligada (booolean), canal (int) e volume (int)
2. TV liga/desliga 
3. Volume: +1 ou -1
4. Mudar canal de 1 em 1 ou definindo o número
*/

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    public void mudarCanal() {
        canal++;
    }
    public void dimunuirCanal() {
        canal--;
    }
    
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
}