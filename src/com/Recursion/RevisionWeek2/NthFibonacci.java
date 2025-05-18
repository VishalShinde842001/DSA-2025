package com.Recursion.RevisionWeek2;

import java.util.Map;

public class NthFibonacci {
    public static void main(String[] args) {
        System.out.println(nthFibonacci(4));
    }

    public static int nthFibonacci(int n) {
        // 0 , 1 , 1 , 2 ....
        if (n < 2) {
            return n;
        }

        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static int nthFibonacciWithOptimal(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int first = 0;
        int second = 1;
        int third = 0;

        for (int i = 2; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

}
