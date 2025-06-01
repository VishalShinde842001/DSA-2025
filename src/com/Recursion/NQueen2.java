package com.Recursion;

import java.util.ArrayList;

public class NQueen2 {
    public static void main(String[] args) {

    }

    public int totalNQueens(int n) {
        return 0;
    }

    public int solution(int row, int col, ArrayList<Integer> visited, int count, int n) {

        if (row >= n) {
            return count;
        }
        return 0;
    }

    private boolean isValid(char[][] board, int row, int col) {
        int n = board.length;
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

}
