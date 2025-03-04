package com.Recursion;

public class CountNumberOf0InNumber {

    public static void main(String[] args) {
        System.out.println(zeroCountInNumber(1000));
    }

    public static int zeroCountInNumber(int number){
        return countHelper(number,0);
    }

//    public static int countHelper(int number,int count){
//        if(number==0){
//            return count;
//        }
//        if(number%10==0){
//            count++;
//        }
//        return countHelper(number/10,count);
//    }

    public static int countHelper(int number, int count) {
        if (number == 0) {
            return count;
        }
        return countHelper(number / 10, count + (number % 10 == 0 ? 1 : 0));
    }

}
