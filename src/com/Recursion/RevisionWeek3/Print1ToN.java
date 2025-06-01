package com.Recursion.RevisionWeek3;

public class Print1ToN {
    public static void main(String[] args) {
       // print1ToN(10);
        print1ToNIterative(200);
    }

    public static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

    public static void print1ToNIterative(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
