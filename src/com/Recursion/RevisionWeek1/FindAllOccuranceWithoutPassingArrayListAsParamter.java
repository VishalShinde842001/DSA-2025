package com.Recursion.RevisionWeek1;

import java.util.ArrayList;
import java.util.List;

public class FindAllOccuranceWithoutPassingArrayListAsParamter {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4};
        System.out.println(getAllOccurances(arr, 3, 0));
    }

    public static ArrayList<Integer> getAllOccurances(int[] arr, int target, int index) {
        ArrayList<Integer> newArr = new ArrayList<>();

        if (index == arr.length) {
            return newArr;
        }
        if (arr[index] == target) {
            newArr.add(index);
        }

        ArrayList<Integer> allBelowResults = getAllOccurances(arr, target, index + 1);

        allBelowResults.addAll(newArr);

        return allBelowResults;
    }
}
