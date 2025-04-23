package com.Array;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class IterateOnMap {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.put(1, "Vishal Shinde");
        myMap.put(2, "Jaydeep Hajare");
        myMap.put(3, "Tejas Dhope");
        myMap.put(4, "Sanket Jain");
        printMap(myMap);
    }

    public static void printMap(Map<Integer, String> studentList) {
        //By using Stream API or Java 8
//        studentList.forEach((key,value)->{
//            System.out.println("Key :"+key+" "+"Value :"+value);
//        })

        for (Map.Entry<Integer, String> entry : studentList.entrySet()) {
            System.out.println("Key =>" + entry.getKey() + " " + " Value =>" + entry.getValue());
        }

        Iterator<Map.Entry<Integer, String>> myIterator = studentList.entrySet().iterator();

        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }
}
