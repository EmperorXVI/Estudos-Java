package ExerciciosSobrecarga;

import java.util.Scanner;

class JogoDaVelha {
    private char[][] jogoVelha;
    private int jogada;

    public JogoDaVelha() {
        jogoVelha = new char[3][3];
        jogada = 1;
    }

    void iniciarJogo() {
        Scanner sc = new Scanner(System.in);
        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        while (!ganhou) {
            if (jogada % 2 == 1) {
                System.out.println("Vez do jogador 1. Escolha linha e coluna de (1-3).");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna de (1-3).");
                sinal = 'O';
            }
            linha = validarEntrada(sc, "linha");
            coluna = validarEntrada(sc, "coluna");

            linha--;
            coluna--;

            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
                System.out.println("Posição já usada, tente novamente");
            } else {
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            imprimirTabuleiro();

            ganhou = verificarGanhador(sinal);

            if (ganhou) {
                System.out.println("Parabéns, jogador " + (sinal == 'X' ? "1" : "2") + " ganhou!!!");
            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida!");
            }
        }

        sc.close();
    }

    int validarEntrada(Scanner sc, String tipo) {
        boolean entradaValida = false;
        int valor = 0;

        while (!entradaValida) {
            System.out.println("Entre com a " + tipo + " 1, 2 ou 3");
            valor = sc.nextInt();
            if (valor >= 1 && valor <= 3) {
                entradaValida = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }

        return valor;
    }

    private void imprimirTabuleiro() {
        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha[i].length; j++) {
                System.out.print((jogoVelha[i][j] == '\u0000' ? ' ' : jogoVelha[i][j]) + " | ");
            }
            System.out.println();
        }
    }

    boolean verificarGanhador(char sinal) {
        for (int i = 0; i < 3; i++) {
            if ((jogoVelha[i][0] == sinal && jogoVelha[i][1] == sinal && jogoVelha[i][2] == sinal) ||
                    (jogoVelha[0][i] == sinal && jogoVelha[1][i] == sinal && jogoVelha[2][i] == sinal)) {
                return true;
            }
        }
        if ((jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) ||
                (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) {
            return true;
        }
        return false;
    }
}
