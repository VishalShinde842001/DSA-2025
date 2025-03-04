package com.Recursion;

public class Recursion1 {

    public static void main(String[] args) {
        message(5);
    }

    public static void message(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        n--;
        message(n);
    }
}
