package com.Recursion.RevisionWeek2;

public class MoveAllOccuranceToEnd {

    public static void main(String[] args) {
        String result = moveToLast("axbxcdxexfx", 'x');
        System.out.println(result); // Output: "abcdefxxx"
    }

    public static String moveToLast(String str, char target) {
        return moveHelper(str, target, 0, "", 0);
    }

    private static String moveHelper(String str, char target, int index, String processed, int count) {
        if (index == str.length()) {
            // Manually append target characters `count` times
            StringBuilder result = new StringBuilder(processed);
            for (int i = 0; i < count; i++) {
                result.append(target);
            }
            return result.toString();
        }

        char ch = str.charAt(index);
        if (ch == target) {
            return moveHelper(str, target, index + 1, processed, count + 1);
        } else {
            return moveHelper(str, target, index + 1, processed + ch, count);
        }
    }
}
