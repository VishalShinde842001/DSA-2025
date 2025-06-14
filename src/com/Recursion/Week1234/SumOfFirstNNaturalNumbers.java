package com.Recursion.Week1234;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfFirstNNaturalNumbers(5));
    }

    public static int sumOfFirstNNaturalNumbers(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfFirstNNaturalNumbers(n-1);
    }
}
