package com.Recursion.RevisionWeek4;

import java.util.List;
import java.util.ArrayList;

public class NQueen {

    public static void main(String[] args) {
        NQueen n = new NQueen();
        for (List<String> str : n.solveNQueens(4)) {
            System.out.println(str);
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> result = new ArrayList<>();

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(0, result, board);
        return result;
    }

    public void solve(int row, List<List<String>> resultList, char[][] board) {
        if (row == board.length) {
            List<String> currentBoard = new ArrayList<>();
            for (char[] r : board) {
                currentBoard.add(new String(r));
            }
            resultList.add(currentBoard);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isValid(row, col, board)) {
                board[row][col] = 'Q';
                solve(row + 1, resultList, board);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    public boolean isValid(int row, int col, char[][] board) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
}
