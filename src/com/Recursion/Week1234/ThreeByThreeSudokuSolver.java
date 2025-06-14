package com.Recursion.Week1234;

public class ThreeByThreeSudokuSolver {

    public static boolean solve(int index, int[][] board) {
        int n = board.length;
        if (index == n * n) return true; // base case: all cells filled

        int row = index / n;
        int col = index % n;

        if (board[row][col] != 0) return solve(index + 1, board);

        for (int val = 1; val <= 3; val++) {
            if (isSafe(row, col, val, board)) {
                board[row][col] = val;
                if (solve(index + 1, board)) return true;
                board[row][col] = 0; // backtrack
            }
        }

        return false;
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] puzzle = {
                {0, 2, 0},
                {3, 0, 0},
                {0, 0, 1}
        };

        if (solve(0, puzzle)) {
            System.out.println("Solved Sudoku:");
            printBoard(puzzle);
        } else {
            System.out.println("No solution exists.");
        }
    }

    public static boolean isSafe(int row, int column, int value, int[][] incompleteSudoku) {
        int n = incompleteSudoku.length;

        // Check row
        for (int i = 0; i < n; i++) {
            if (incompleteSudoku[row][i] == value) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < n; i++) {
            if (incompleteSudoku[i][column] == value) {
                return false;
            }
        }

        // Check main diagonal (top-left to bottom-right)
        if (row == column) {
            for (int i = 0; i < n; i++) {
                if (incompleteSudoku[i][i] == value) {
                    return false;
                }
            }
        }

        // Check anti-diagonal (top-right to bottom-left)
        if (row + column == n - 1) {
            for (int i = 0; i < n; i++) {
                if (incompleteSudoku[i][n - 1 - i] == value) {
                    return false;
                }
            }
        }

        return true;
    }


    public static int[][] sudokuProvider() {
        return new int[][]{
                {0, 2, 0},
                {3, 0, 0},
                {0, 0, 1}
        };
    }
}
