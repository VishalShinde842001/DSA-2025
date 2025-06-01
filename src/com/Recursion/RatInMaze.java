package com.Recursion;

import java.util.ArrayList;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        RatInMaze ram = new RatInMaze();
        for (String str : ram.ratInMaze(matrix)) {
            System.out.println(str);
        }
    }

    public ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        ArrayList<String> result = new ArrayList<>();

        if (maze[0][0] == 1) {
            ratInMazeHelper(maze, 0, 0, "", visited, result);
        }

        return result;
    }

    public void ratInMazeHelper(int[][] maze, int row, int col, String path, boolean[][] visited, ArrayList<String> result) {
        int n = maze.length;

        // Base case: destination reached
        if (row == n - 1 && col == n - 1) {
            result.add(path);
            return;
        }

        // Mark current cell as visited
        visited[row][col] = true;

        for (int[] move : getAllPossibleMovingLocations(row, col)) {
            int newRow = move[0];
            int newCol = move[1];
            int directionCode = move[2];

            if (isValidCellToMove(maze, newRow, newCol, visited)) {
                char direction = movingPosition(directionCode);
                ratInMazeHelper(maze, newRow, newCol, path + direction, visited, result);
            }
        }

        // Backtrack: unmark the current cell
        visited[row][col] = false;
    }

    public char movingPosition(int number) {
        char dir;
        switch (number) {
            case 1:
                dir = 'U';
                break;
            case 2:
                dir = 'R';
                break;
            case 3:
                dir = 'D';
                break;
            case 4:
                dir = 'L';
                break;
            default:
                dir = '?';
        }
        return dir;
    }

    public ArrayList<int[]> getAllPossibleMovingLocations(int row, int col) {
        ArrayList<int[]> moves = new ArrayList<>();
        moves.add(new int[]{row - 1, col, 1}); // Up
        moves.add(new int[]{row, col + 1, 2}); // Right
        moves.add(new int[]{row + 1, col, 3}); // Down
        moves.add(new int[]{row, col - 1, 4}); // Left
        return moves;
    }

    public boolean isValidCellToMove(int[][] maze, int row, int col, boolean[][] visited) {
        return row >= 0 && col >= 0 && row < maze.length && col < maze.length &&
                maze[row][col] == 1 && !visited[row][col];
    }
}
