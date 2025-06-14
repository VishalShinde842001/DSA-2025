package com.Recursion.Week1234;

public class NKnight {
    public static void main(String[] args) {
        int n = 4;  // board size
        int knights = 4; // number of knights to place
        solve(new boolean[n][n], 0, 0, knights);
    }

    public static void solve(boolean[][] board, int row, int col, int knightsRemaining) {
        if (knightsRemaining == 0) {
            printBoard(board);
            return;
        }

        int n = board.length;
        if (row >= n) return;

        int nextRow = col == n - 1 ? row + 1 : row;
        int nextCol = col == n - 1 ? 0 : col + 1;

        if (isSafe(row, col, board)) {
            board[row][col] = true;
            solve(board, nextRow, nextCol, knightsRemaining - 1);
            board[row][col] = false;
        }

        solve(board, nextRow, nextCol, knightsRemaining);
    }

    public static boolean isSafe(int row, int col, boolean[][] board) {
        int[][] directions = {
                {-2, -1}, {-2, +1},
                {-1, -2}, {-1, +2},
                {+1, -2}, {+1, +2},
                {+2, -1}, {+2, +1}
        };

        for (int[] d : directions) {
            int r = row + d[0];
            int c = col + d[1];
            if (r >= 0 && c >= 0 && r < board.length && c < board.length) {
                if (board[r][c]) return false;
            }
        }
        return true;
    }

    public static void printBoard(boolean[][] board) {
        System.out.println("==================================");
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "K " : ". ");
            }
            System.out.println();
        }
    }
}
