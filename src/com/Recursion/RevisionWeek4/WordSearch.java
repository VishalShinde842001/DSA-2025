package com.Recursion.RevisionWeek4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class WordSearch {
    public static void main(String[] args) {
        WordSearch ws = new WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'E'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCFD";
        System.out.println(ws.exist(board, word));
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        return existChecker(board, word, 0, 0, 0, visited);
    }

    public boolean existChecker(char[][] board, String word, int row, int col, int index, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }

        for (int[] cell : getAllPossibleCells(row, col, board, visited)) {
            int newRow = cell[0];
            int newCol = cell[1];

            if (board[newRow][newCol] == word.charAt(index)) {
                visited[newRow][newCol] = true;
                if (existChecker(board, word, newRow, newCol, index + 1, visited)) {
                    return true;
                }
                visited[newRow][newCol] = false; // backtrack
            }
        }

        return false;
    }


    public List<int[]> getAllPossibleCells(int row, int col, char[][] board, boolean[][] visited) {
        List<int[]> cellList = new ArrayList<>();
        int rows = board.length;
        int cols = board[0].length;

        // Up
        if (row - 1 >= 0 && !visited[row - 1][col]) {
            cellList.add(new int[]{row - 1, col});
        }

        // Down
        if (row + 1 < rows && !visited[row + 1][col]) {
            cellList.add(new int[]{row + 1, col});
        }

        // Left
        if (col - 1 >= 0 && !visited[row][col - 1]) {
            cellList.add(new int[]{row, col - 1});
        }

        // Right
        if (col + 1 < cols && !visited[row][col + 1]) {
            cellList.add(new int[]{row, col + 1});
        }

        // Optional: Add diagonals or other directions here

        return cellList;
    }


}
