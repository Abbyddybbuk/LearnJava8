package com.learn.java8.main;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        System.out.println("******Start of HashMap Example***********************");
        Map<Key, String> hashMap = new HashMap<>();
        Key key1 = new Key("key1");
        Key key2 = new Key("key2");
        hashMap.put(key1, "Value 1");
        hashMap.put(key2, "Value 2");
        System.out.println("Before garbage collection:");
        System.out.println(hashMap);

        // Making key1 eligible for garbage collection
        key1 = null;
        // Triggering garbage collection
        System.gc();

        System.out.println("After garbage collection:");
        System.out.println(hashMap);
        System.out.println("******End of HashMap Example***********************");

        System.out.println("******Start of WeakHashMap Example***********************");
        WeakHashMap<Key, String> weakHashMap = new WeakHashMap<>();

        Key key11 = new Key("key1");
        Key key22 = new Key("key2");

        weakHashMap.put(key11, "Value 1");
        weakHashMap.put(key22, "Value 2");

        System.out.println("Before garbage collection:");
        System.out.println(weakHashMap);

        // Making key1 eligible for garbage collection
        key11 = null;

        // Triggering garbage collection
        System.gc();

        System.out.println("After garbage collection:");
        System.out.println(weakHashMap);
        System.out.println("******End of WeakHashMap Example***********************");
    }

    static class Key {
        private String id;

        Key(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "id='" + id + '\'' +
                    '}';
        }
    }
}
