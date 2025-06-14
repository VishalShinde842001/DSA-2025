package com.Recursion.Week5;

public class CountZeros {

    public static void main(String[] args) {
        CountZeros cz = new CountZeros();
        System.out.println(cz.zeroCount(-10));
    }

    public int zeroCount(int number) {
        if (number < 0) {
            number = Math.abs(number);
        }
        return countHelper(number, 0);
    }

    public int countHelper(int number, int count) {
        if (number < 10) {
            return count;
        }

        if (number % 10 == 0) {
            count = count + 1;
        }
        return countHelper(number / 10, count);
    }
}
