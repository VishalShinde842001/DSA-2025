package com.Recursion;

//No Solved
public class SudokuSolver {

    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

    }

    public void solveSudoku(int[][] board) {


    }

    public static boolean isEmpty(int n) {
        if (n > 0) {
            return false;
        }
        return true;
    }

    public static boolean isSafe(int row, int column, int value, int[][] board) {

        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == value) {
                return false;
            }
        }

        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] == value) {
                return false;
            }
        }

        return quadrantWiseCheck(row, column, value, board);
//        return true;
    }


    public static boolean quadrantWiseCheck(int row, int col, int value, int[][] board) {

        int boxStartRow = row - row % 3;
        int boxStartCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[boxStartRow + i][boxStartCol + j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}
