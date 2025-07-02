package com.TicTakToe;

import java.util.Scanner;

public class tickTakToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player ='X';
        boolean gameOver = false;
        Scanner in = new Scanner(System.in);
        while(!gameOver) {
            printBoard(board);
            System.out.println("Player "+ player +" enter: ");
            int row  = in.nextInt();
            int col = in.nextInt();
            if(board[row][col] == ' ') {
                board[row][col] = player;
                gameOver= haveWon(board, player);
                if(gameOver) {
                    System.out.println(player+ " has won the game.");
                } else{
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else{
                System.out.println("Invalid Move. Try Again");
            }
        }
        printBoard(board);
    }

    public static boolean haveWon(char[][] board, char player) {
        //row
        for (int i = 0; i < board.length; i++) {
            if(board[i][0] == player &&  board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        //col 
        for (int i = 0; i < board.length; i++) {
            if(board[0][i] == player &&  board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        
        //diagonal
        if(board[0][0] == player &&  board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if(board[0][2] == player &&   board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+ " | ");
            }
            System.out.println();
        }
    }
}
