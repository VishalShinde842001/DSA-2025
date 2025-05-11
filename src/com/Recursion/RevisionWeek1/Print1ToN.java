package com.Recursion.RevisionWeek1;

public class Print1ToN {
    public static void main(String[] args) {
        printMethod(5);
    }

    public static void printMethod(int n) {
        if (n == 0) {
            return;
        }

        printMethod(n - 1);
        System.out.println(n);
    }
}
