package com.Recursion.Week1234;

public class UniquePath62_leetcode {
    public static void main(String[] args) {
        UniquePath62_leetcode ul = new UniquePath62_leetcode();
        int result = ul.uniquePaths(3, 7);
        System.out.println("Total Unique Paths: " + result);
    }

    public int uniquePaths(int m, int n) {
        return solve(m, n, 0, 0);
    }

    public int solve(int m, int n, int currentRow, int currentCol) {
        if (!isValidCell(m, n, currentRow, currentCol)) {
            return 0;
        }

        if (isDestination(m, n, currentRow, currentCol)) {
            return 1;
        }

        int down = solve(m, n, currentRow + 1, currentCol);
        int right = solve(m, n, currentRow, currentCol + 1);
        return down + right;
    }

    public boolean isValidCell(int m, int n, int currentRow, int currentCol) {
        return currentRow < m && currentCol < n && currentRow >= 0 && currentCol >= 0;
    }

    public boolean isDestination(int m, int n, int currentRow, int currentCol) {
        return (currentRow == (m - 1) && currentCol == (n - 1));
    }
}
