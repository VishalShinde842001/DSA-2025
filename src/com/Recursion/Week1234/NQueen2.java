package com.Recursion.Week1234;

public class NQueen2 {

    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        int totalSolutions = countSolutions(board, 0);
        System.out.println("Total number of solutions: " + totalSolutions);
    }

    public static int countSolutions(boolean[][] board, int row) {
        int n = board.length;

        if (row == n) {
            return 1; // Found one valid configuration
        }

        int count = 0;

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = true;
                count += countSolutions(board, row + 1); // Recurse
                board[row][col] = false; // Backtrack
            }
        }

        return count;
    }

    public static boolean isSafe(int row, int col, boolean[][] board) {
        int n = board.length;

        // Check column ↑
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        // Check upper-left diagonal ↖
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) return false;
        }

        // Check upper-right diagonal ↗
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j]) return false;
        }

        return true;
    }
}
