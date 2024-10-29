package Enum_Static.TicTacToe;

import java.util.Scanner;

enum ValorCelula {
    X, O, VAZIO
}

public class TicTacToe {
    private ValorCelula[][] tabuleiro;
    private ValorCelula jogadorAtual;

    public TicTacToe() {
        tabuleiro = new ValorCelula[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ValorCelula.VAZIO;
            }
        }
        jogadorAtual = ValorCelula.X;
    }

    public void exibirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean fazerJogada(int linha, int coluna) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || tabuleiro[linha][coluna] != ValorCelula.VAZIO) {
            System.out.println("Movimento invalido. Tente novamente.");
            return false;
        }
        tabuleiro[linha][coluna] = jogadorAtual;
        jogadorAtual = (jogadorAtual == ValorCelula.X) ? ValorCelula.O : ValorCelula.X;
        return true;
    }

    public boolean verificarVitoria() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != ValorCelula.VAZIO && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                return true;
            }
            if (tabuleiro[0][i] != ValorCelula.VAZIO && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
                return true;
            }
        }
        if (tabuleiro[0][0] != ValorCelula.VAZIO && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            return true;
        }
        if (tabuleiro[0][2] != ValorCelula.VAZIO && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            return true;
        }
        return false;
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ValorCelula.VAZIO) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TicTacToe jogo = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        boolean jogoFinalizado = false;

        System.out.println("Jogo da Velha Iniciado!");
        jogo.exibirTabuleiro();

        while (!jogoFinalizado) {
            System.out.println("Jogador " + jogo.jogadorAtual + ", e a sua vez!");
            System.out.print("Digite a linha (0, 1, ou 2): ");
            int linha = scanner.nextInt();
            System.out.print("Digite a coluna (0, 1, ou 2): ");
            int coluna = scanner.nextInt();

            if (jogo.fazerJogada(linha, coluna)) {
                jogo.exibirTabuleiro();
                if (jogo.verificarVitoria()) {
                    System.out.println("Jogador " + (jogo.jogadorAtual == ValorCelula.X ? "O" : "X") + " ganhou!");
                    jogoFinalizado = true;
                } else if (jogo.verificarEmpate()) {
                    System.out.println("O jogo terminou em empate!");
                    jogoFinalizado = true;
                }
            }
        }
        scanner.close();
    }
}

