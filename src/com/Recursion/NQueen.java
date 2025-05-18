package com.Recursion;

public class NQueen {

    public static void main(String[] args) {
        boolean[][] solutionArr = new boolean[5][5];
        solve(solutionArr, 0);
    }

    public static void solve(boolean[][] solutionArray, int row) {
        if (row == solutionArray.length) {
            for (int i = 0; i < solutionArray.length; i++) {
                for (int j = 0; j < solutionArray[i].length; j++) {
                    System.out.print(solutionArray[i][j] ? " Q " : " . ");
                }
                System.out.println();
            }
            System.out.println("---------------------");

            // No need to reset the board, backtracking will handle that
            return;
        }


        for (int i = 0; i < solutionArray.length; i++) {
            if (isSafe(row, i, solutionArray)) {
                solutionArray[row][i] = true;
                solve(solutionArray, row + 1);
                solutionArray[row][i] = false;
            }
        }
    }

    public static boolean isSafe(int row, int col, boolean[][] solutionArray) {

        int n = solutionArray.length;

        for (int i = 0; i < row; i++) {
            if (solutionArray[i][col]) {
                return false;
            }
        }



        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (solutionArray[i][j]) {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (solutionArray[i][j]) {
                return false;
            }
        }
        return true;
    }
}
