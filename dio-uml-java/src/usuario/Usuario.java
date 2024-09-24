package usuario;

import mobile.aparelho.AparelhoTelefonico;
import mobile.navegador.NavegadorInternet;
import mobile.reprodutor.ReprodutorMusical;
import mobile.iPhone;

public class Usuario {
    public static void main(String[] args) {
        iPhone iph = new iPhone();

        ReprodutorMusical reprodutor = iph;
        AparelhoTelefonico aparelho = iph;
        NavegadorInternet navegador = iph;

        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();

        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
