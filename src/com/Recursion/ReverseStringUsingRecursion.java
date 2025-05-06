package com.Recursion;

public class ReverseStringUsingRecursion {

    public static void main(String[] args) {
        System.out.println(reverse("Vishal"));
    }

    public static String reverse(String str){
        return revHelper(str.length()-1,str,"");
    }

    public static String revHelper(int endIndex,String normalString,String
            reversedString){
        if(0 > endIndex){
            return reversedString;
        }
        return reversedString + normalString.charAt(endIndex)+ revHelper(endIndex-1,normalString,reversedString);
    }
}
