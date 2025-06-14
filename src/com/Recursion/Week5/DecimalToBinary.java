package com.Recursion.Week5;

public class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary dtB = new DecimalToBinary();
        System.out.println(dtB.decimalToBinary(2));

    }

    public String decimalToBinary(int number) {
        String str = "";
        decimalToBinary(number, str);
        return str;
    }

    public void decimalToBinary(double number, String str) {
        if (number == 0) {
            return;
        }

        decimalToBinary(number / 10, str + number % 10);


    }
}
