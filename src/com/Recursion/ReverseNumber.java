package com.Recursion;

public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println(reverseNum(1000));
    }

    public static int reverseNum(int num){
        return reverse(num,0);
    }


    public static int reverse(int num,int sum){
        if(num <=0){
            return sum;
        }
        int remainder=num %10;
        sum= sum * 10 + remainder;
        return reverse(num/10,sum);
    }


}
