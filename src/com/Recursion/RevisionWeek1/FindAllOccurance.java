package com.Recursion.RevisionWeek1;

import java.util.ArrayList;
import java.util.List;

public class FindAllOccurance {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 4};
        int target = 4;
        System.out.println(getAllOccurances(arr, target));
    }

    public static List<Integer> getAllOccurances(int[] arr, int target) {
        return getAllOccuranceHelper(arr, target, 0, new ArrayList<>());
    }

    public static List<Integer> getAllOccuranceHelper(int[] arr, int target, int index, List<Integer> list) {
        if (index >= arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return getAllOccuranceHelper(arr, target, index + 1, list);

    }
}
