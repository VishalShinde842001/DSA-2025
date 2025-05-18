package com.Recursion.Permutations;

public class Permutation1 {

    public static void main(String[] args) {
        //     permutations("", "ABC");
        permuation1("", "ABC");
    }

    public static void permuation1(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String firstPart = p.substring(0, i);
            String lastPart = p.substring(i, p.length());
            permuation1(firstPart + ch + lastPart, up.substring(1));
        }
    }

//    public static void permutations(String p, String up) {
//        System.out.println("P===>" + p);
//        System.out.println("UP===>" + up);
//        if (up.isEmpty()) {
//            System.out.println(p);
//            return;
//        }
//        char ch = up.charAt(0);
////        System.out.println("Ch=>" + ch);
////        System.out.println("p.length()=========>" + p.length());
//        for (int i = 0; i <= p.length(); i++) {
//            String f = p.substring(0, i);
//            String e = p.substring(i, p.length());
////            System.out.println("F=>" + f);
////            System.out.println("E=>" + e);
////            System.out.println("NEW p=>" + f + ch + e);
//            permutations(f + ch + e, up.substring(1));
//        }
//    }
}
