package com.learn.java8.main;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class MapLearningDemo {
    public static void main(String[] args) {
        Map<String, String> demoMap = new HashMap<>();
        demoMap.put("abc", "Abhijeet");
        demoMap.put("def", "Ankur");
        demoMap.put("xyz", "Kuls");

        String tempMap=demoMap.put("abc", "ReplacedObject");
        System.out.println(tempMap);
        System.out.println(demoMap.entrySet());//Returns the complete Map as entries are called entry set
        System.out.println(demoMap.keySet());//Returns the Keys
        String removedEntry= demoMap.remove("def");//Removes the entry if present else returns null
        System.out.println(removedEntry);

        removedEntry= demoMap.remove("try");
        System.out.println(removedEntry);//Returns null as entry with try is not present

        System.out.println(demoMap.entrySet());//Returns the complete Map as entries are called entry set
        System.out.println(demoMap.keySet());//Returns the Keys
        System.out.println("*****XXX**************************************XXX************");
        Map<String, String> idtyHashMap = new IdentityHashMap<>();
//        String tempKey = new String("abc");
        String tempKey = "abc";
        String tempKey2 = new String("abc");
        if (tempKey2==tempKey) {
            System.out.println("Equality Executed");
        } else {
            System.out.println("Equality NOT Executed");
        }
        idtyHashMap.put(tempKey, "Creta");
        idtyHashMap.put(tempKey2, "Tarraco");
        System.out.println(idtyHashMap.entrySet());

    }
}
