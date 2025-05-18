package com.Recursion.RevisionWeek2;

public class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialIterative(5));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int factorialIterative(int n) {

        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
