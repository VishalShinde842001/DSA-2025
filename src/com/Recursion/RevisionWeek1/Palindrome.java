package com.Recursion.RevisionWeek1;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("ava"));
    }

    public static boolean isPalindrome(String str){
        return isPalidromeChecker(str,0,str.length()-1);
    }

    public static boolean isPalidromeChecker(String str,int start,int end){
        if(start >= end){
            return true;
        }

        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return  isPalidromeChecker(str,start+1,end-1);
    }
}

