package com.Recursion.RevisionWeek1;

import java.util.Scanner;

//Simply we need to divide problem in small problems
//As we know 5! = 5 * 4 * 3 * 2 * 1
// 4!=4 * 3 * 2 * 1
//So we can replace 5! = 5 * 4!
//In same way fact(n)=n*fact(n-1)
public class Factorial {

    public static void main(String[] args) {
        System.out.println("Put the value of n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static long factorial(int n) {
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
