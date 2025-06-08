package com.Recursion.RevisionWeek4;

public class UniquePath_Leetcode62 {
    public static void main(String[] args) {
        UniquePath_Leetcode62 up62 = new UniquePath_Leetcode62();
        System.out.println(up62.uniquePaths(3, 7));
    }

    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return uniquePathHelper(m, n, 0, 0,dp);
    }

    public int uniquePathHelper(int m, int n, int row, int col,int[][] dp) {
        if (row >= m || col >= n) {
            return 0;
        }

        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        if ((m - 1) == row && (n - 1) == col) {
            return 1;
        }


        return dp[row][col]=uniquePathHelper(m, n, row + 1, col,dp) + uniquePathHelper(m, n, row, col + 1,dp);
    }
}
