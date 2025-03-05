package com.devdeividmoura.maratonajava.projects.tictactoe;

import java.util.Scanner;

/**
 * TicTacToe game implementation.
 * <p>
 * This program allows two players to play a Tic Tac Toe game in the console.
 * It uses a 3x3 board and prompts players to enter their moves in a coordinate format (e.g., A1).
 * The game checks for winning conditions and tie scenarios.
 * </p>
 */
public class TicTacToe {
    public static void main(String[] args) {
        String[][] board = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };

        String player = "X";
        int totalMoves = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printBoard(board);
            System.out.print("Jogador " + player + ", faça a sua jogada (ex.: A1): ");
            String move = scanner.next().toUpperCase();

            if (move.length() != 2) {
                System.out.println("Entrada inválida. Use o formato <Coluna><Linha> (ex.: A1).");
                continue;
            }

            char colChar = move.charAt(0);
            char rowChar = move.charAt(1);

            if (colChar < 'A' || colChar > 'C' || rowChar < '1' || rowChar > '3') {
                System.out.println("Jogada fora dos limites do board. Tente novamente.");
                continue;
            }

            int col = colChar - 'A';
            int row = rowChar - '1';

            if (!board[row][col].equals(" ")) {
                System.out.println("A posição " + move + " já está ocupada pelo jogador " + board[row][col]);
                continue;
            }

            board[row][col] = player;
            totalMoves++;

            // Checa linhas e colunas
            if ((board[row][0].equals(player) && board[row][1].equals(player) && board[row][2].equals(player)) ||
                    (board[0][col].equals(player) && board[1][col].equals(player) && board[2][col].equals(player))) {
                printBoard(board);
                System.out.println("O jogador " + player + " venceu!");
                break;
            }

            // Checa diagonais
            if ((row == col && board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) ||
                    (row + col == 2 && board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player))) {
                printBoard(board);
                System.out.println("O jogador " + player + " venceu!");
                break;
            }

            // Checa empate
            if (totalMoves == 9) {
                printBoard(board);
                System.out.println("Empate!");
                break;
            }

            player = player.equals("X") ? "O" : "X";
        }

        scanner.close();
    }

    public static void printBoard(String[][] board) {
        // Imprime o board
        System.out.println("  A   B   C");
        for (int i = 0; i < board.length; i++) {
            System.out.print((i + 1));
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j] + " ");
                if (j < board[i].length - 1)
                    System.out.print("│");
            }
            System.out.println();
            if (i < board.length - 1)
                System.out.println(" ───┼───┼───");
        }
    }
}
