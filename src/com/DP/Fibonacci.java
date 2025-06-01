package com.DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci.fib(n));
    }

    public int fib(int n) {
        int[] dp = new int[n + 1];
        return fiboHelper(n, dp);

    }

    public int fiboHelper(int n, int[] dp) {
        //   System.out.println(n);
        if (dp[n] != 0) {
            return dp[n];
        }
        if (n <= 1) {
            return n;
        }
        return dp[n] = fiboHelper(n - 2, dp) + fiboHelper(n - 1, dp);
    }

    public int fiboHelperTabulation(int n) {
            if (n <= 1) return n;

            int[] dp = new int[n + 1];

            dp[0] = 0;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp[n];
    }
}
