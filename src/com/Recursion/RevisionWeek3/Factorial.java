package com.Recursion.RevisionWeek3;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorialIterative(4));
    }

    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
