package com.Recursion.RevisionWeek3;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(2123));
        System.out.println(sumOfDigitsIterative(-2124));
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static int sumOfDigitsIterative(int n) {
        //This first block of if statement is redundant must avoid
      /*  if (n < 10) {
            return n;
        }*/
        //Also handle negative cases
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
