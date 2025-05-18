package com.Recursion.RevisionWeek2;

public class PrintAllSubsets {

    public static void main(String[] args) {
        printeAllSubsets("ABC");
    }

    public static void printeAllSubsets(String str) {
        printHelper(" ", str);

    }

    public static void printHelper(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        // System.out.println("Processed String :" + p);
        //  System.out.println("Unprocessed String : " + up);
        char ch = up.charAt(0);

        printHelper(p + ch, up.substring(1));
        printHelper(p, up.substring(1));
    }
}
