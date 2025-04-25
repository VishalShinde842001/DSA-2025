package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) {

        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        myHashMap.put("Vishal", 24);
        myHashMap.put(new String("Vishal"), 25);

        for (Map.Entry<String, Integer> myHashMapEntry : myHashMap.entrySet()) {
            System.out.println(myHashMapEntry.getKey() + " : " + myHashMapEntry.getValue());
        }
    }
}

class User{
    int userId;
    String name;
}
