package com.Recursion.RevisionWeek2;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(10009));
        System.out.println(sumOfDigitsIterative(10009));
    }

    public static int sumOfDigits(int number) {

        if (number < 10) {
            return number;
        }
        return number % 10 + sumOfDigits(number / 10);

    }

    public static int sumOfDigitsIterative(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
