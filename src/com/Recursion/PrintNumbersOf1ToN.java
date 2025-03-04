package com.Recursion;

public class PrintNumbersOf1ToN {
    public static void main(String[] args) {
        printNumbersOf1ToN(5);
    }

    public static void printNumbersOf1ToN(int n){
        if(n==0){
            return;
        }
        printNumbersOf1ToN(n-1);
        System.out.println(n);
    }
}
