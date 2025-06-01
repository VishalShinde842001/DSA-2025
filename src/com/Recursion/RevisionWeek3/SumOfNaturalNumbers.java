package com.Recursion.RevisionWeek3;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNum(5));
        System.out.println(sumOfNaturalNumIterative(5));
    }

    public static long sumOfNaturalNum(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumOfNaturalNum(n - 1);
    }

    public static long sumOfNaturalNumIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
