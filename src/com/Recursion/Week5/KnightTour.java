package com.Recursion.Week5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KnightTour {

    public static void main(String[] args) {
        int[][] grid = {
                {0, 5, 18, 9, 12, 27},
                {3, 8, 1, 28, 19, 10},
                {6, 17, 4, 11, 26, 13},
                {33, 2, 7, 22, 29, 20},
                {16, 23, 34, 31, 14, 25},
                {35, 32, 15, 24, 21, 30}
        };


        KnightTour kt = new KnightTour();
        System.out.println(kt.checkValidGrid(grid));
    }

    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) return false;
        Map<Integer, String> locationMap = locationMap(grid);
        return checkHelper(grid, new int[]{0, 0}, 1, locationMap);
    }

    public boolean checkHelper(int[][] grid, int[] currentPosition, int requiredNumber, Map<Integer, String> locationMap) {
        int length = grid.length;
        if (requiredNumber == (length * length)) {
            return true;
        }

        String nextPosStr = locationMap.get(requiredNumber);
        if (nextPosStr == null) {
            return false;
        }

        if (allPossibleMoves(currentPosition[0], currentPosition[1],grid).contains(nextPosStr)) {
            String[] parts = nextPosStr.split("_");
            int nextRow = Integer.parseInt(parts[0]);
            int nextCol = Integer.parseInt(parts[1]);
            return checkHelper(grid, new int[]{nextRow, nextCol}, requiredNumber + 1, locationMap);
        } else {
            System.out.println("Next Position Not Found for :" + requiredNumber);
            System.out.println("Current Position :" + "(" + currentPosition[0] + "," + currentPosition[1] + ")");
            return false;
        }
    }

    public Set<String> allPossibleMoves(int row, int col, int[][] grid) {
        int length = grid.length;
        Set<String> moveSet = new HashSet<>();

        int[][] moves = {
                {-2, -1}, {-2, 1},
                {-1, -2}, {-1, 2},
                {1, -2}, {1, 2},
                {2, -1}, {2, 1}
        };

        for (int[] move : moves) {
            int newRow = row + move[0];
            int newCol = col + move[1];
            if (isValid(newRow, newCol, length)) {
                moveSet.add(newRow + "_" + newCol);
            }
        }
        return moveSet;
    }

    public boolean isValid(int row, int col, int n) {
        return row >= 0 && row < n && col >= 0 && col < n;
    }

    public HashMap<Integer, String> locationMap(int[][] grid) {
        HashMap<Integer, String> locations = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                locations.put(grid[i][j], i + "_" + j);
            }
        }
        return locations;
    }
}
