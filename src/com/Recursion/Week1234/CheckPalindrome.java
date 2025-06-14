package com.Recursion.Week1234;

public class CheckPalindrome {

    public static void main(String[] args) {
//        System.out.println(checkPalindrome("ababa"));
        System.out.println(isPalindrome("abba"));
    }


    static boolean isPalindrome(String s) {
        // code here
        return checker(0,s.length()-1,s);
    }

    static boolean checker(int start,int end,String s){
        System.out.println("Start : "+start);
        System.out.println("End :"+end);
        System.out.println("S : "+s);
        if(start > end){
            return true;
        }

        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }else {
            start=start+1;
            end=end-1;
        }

        return checker(start,end,s);
    }

//    public static boolean checkPalindrome(String str){
//        return checkHelper(0,str.length()-1,str);
//    }
//
//    public static boolean checkHelper(int start,int end,String str){
//
//        if(start > end){
//            return true;
//        }
//
//        if(str.charAt(start)!=str.charAt(end)){
//            return false;
//        }
//
//        start++ ;end--;
//        return checkHelper(start,end,str);
//    }
}
