package mobile;

import java.util.Scanner;

import mobile.aparelho.AparelhoTelefonico;
import mobile.navegador.NavegadorInternet;
import mobile.reprodutor.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private Scanner scanner = new Scanner(System.in);
    private String[] musicas = {"Dead Flowers", "The Witch and The Lion", "The First and The Last"};
    private String[] ligacao = {"(19)98888-9999 - Benício", "(19)97777-5555 - Helena", "(19)94747-4747 - Matteo"};

    public void tocar() {
        String musica = selecionarMusica();
        if (musica != null) {
            System.out.println("Tocando: " + musica);
        }
    }

    public String selecionarMusica() {
        System.out.println("Escolha as músicas na playlist: ");
        for (int i = 0; i < musicas.length; i++) {
            System.out.println((i + 1) + ". " + musicas[i]);
        }
        int escolha = scanner.nextInt();
        if (escolha > 0 && escolha <= musicas.length) {
            return musicas[escolha - 1];
        } else {
            System.out.println("Escolha inválida.");
            return null;
        }
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public String ligar() {
        System.out.println("Ligar para: ");
        for (int j = 0; j <= ligacao.length; j++) {
            System.out.println((j + 1) + ". " + ligacao[j]);
        }
        int candidato = scanner.nextInt();
        if (candidato > 0 && candidato < ligacao.length) {
            return ligacao[candidato - 1];
        } else {
            System.out.println("Escolha inválida.");
            return null;
        }
    }

    public void atender() {
        String numero = ligar();
        if (numero != null) {
            System.out.println("Atendendo a chamada de: " + numero);
        } else {
            System.out.println("Nenhuma chamada para atender.");
        }
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    public String exibirPagina() {
        System.out.println("Digite a URL onde irá navegar: ");
        String url = scanner.next();
        System.out.println("Navegando para: " + url);
        return url;
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}

