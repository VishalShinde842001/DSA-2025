package com.DP;

public class ClimbStairs {

    public static void main(String[] args) {
        ClimbStairs cs = new ClimbStairs();
        System.out.println(cs.climbStairs(4));
    }

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return climbStairs(n, dp);
    }

    public int climbStairs(int n, int[] dp) {
        if (dp[n] != 0) {
            return dp[n];
        }
        if (n <= 2) {
            return n;
        }

        return dp[n] = climbStairs(n - 1, dp) + climbStairs(n - 2, dp);
    }
}

