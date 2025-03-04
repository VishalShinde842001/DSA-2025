package com.Array;

public class CountDigits {

    public static void main(String[] args) {
        System.out.println(evenlyDivides(39));
    }

    static int evenlyDivides(int n) {

        int num=n;
        int count=0;
        while(num!=0){
            int lastDig=num%10;
            if(lastDig!=0 && n%lastDig==0)
            {
                count++;
            }
            num=num/10;
        }
        return count;
    }
}
