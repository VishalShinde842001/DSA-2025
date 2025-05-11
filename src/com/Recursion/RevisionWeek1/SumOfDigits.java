package com.Recursion.RevisionWeek1;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(10000));
    }

    public static int sumOfDigits(int num) {
        if (num < 10) {
            return num;
        }
        return num % 10 + sumOfDigits(num / 10);
    }
}
