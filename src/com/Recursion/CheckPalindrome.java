package com.Recursion;

public class CheckPalindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("ababa"));
    }

    public static boolean checkPalindrome(String str){
        return checkHelper(0,str.length()-1,str);
    }

    public static boolean checkHelper(int start,int end,String str){

        if(start > end){
            return true;
        }

        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }

        start++ ;end--;
        return checkHelper(start,end,str);
    }
}
