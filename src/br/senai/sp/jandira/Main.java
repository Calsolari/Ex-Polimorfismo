package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Jogador;

public class Main {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();
        jogador1.cadastrarJogador();
        jogador1.exibirInformacoes();
    }
}
