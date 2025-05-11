package com.Recursion.RevisionWeek1;

public class SumOfNNatural {
    public static void main(String[] args) {
        System.out.println(sumOfFirstNNumbers(5));
    }

    public static int sumOfFirstNNumbers(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfFirstNNumbers(n-1);
    }
}
