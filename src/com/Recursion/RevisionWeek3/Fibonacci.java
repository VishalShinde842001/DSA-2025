package com.Recursion.RevisionWeek3;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
        System.out.println(fibonacciIterative(4));
    }

    public static long fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long fibonacciIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long first = 0;
        long second = 1;
        long next = 0;

        for (int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }

        return second;
    }

}
