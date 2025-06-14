package com.Recursion.Week1234;

import java.util.List;
import java.util.ArrayList;

public class WordSearch {

    public static void main(String[] args) {
        WordSearch ws = new WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        System.out.println(ws.exist(board, "ABCCED"));
    }

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean isSolved = solve(board, word, 0, i, j);
                if (isSolved) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean solve(char[][] board, String word, int index, int row, int col) {
        if (index == word.length()) return true;

        // Boundary + visited + mismatch check
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length ||
                board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark as visited
        char temp = board[row][col];
        board[row][col] = '#';

        // All 4 directions
        int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (solve(board, word, index + 1, newRow, newCol)) {
                return true;
            }
        }

        // Backtrack
        board[row][col] = temp;
        return false;
    }

    public boolean isValid(int[] indexes, char[][] board) {
        // indexes[0] = row, indexes[1] = column
        if (indexes[0] < 0 || indexes[0] >= board.length) {
            return false; // Row out of bounds
        }
        if (indexes[1] < 0 || indexes[1] >= board[0].length) {
            return false; // Column out of bounds
        }
        return true; // Both row and column are valid
    }


    public List<int[]> checkingPositions(int row, int col) {
        List<int[]> checkerList = new ArrayList<>();

        checkerList.add(new int[]{row, col - 1});
        checkerList.add(new int[]{row, col + 1});
        checkerList.add(new int[]{row - 1, col});
        checkerList.add(new int[]{row + 1, col});
        return checkerList;
    }
}
