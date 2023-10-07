package com.dufuna.berlin.akinfenwa.address.hashmap;

import java.util.HashMap;

public class HashMapped {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Alice");
        hashMap.put(2, "Bob");
        hashMap.put(3, "Charlie");
        hashMap.put(4, "David");

        String value1 = hashMap.get(1);
        String value2 = hashMap.get(2);
        // Check if a key exists in the HashMapped
        System.out.println("Value associated with key 1: " + value1);
        System.out.println("Value associated with key 2: " + value2);


        boolean containsKey = hashMap.containsKey(3);
        System.out.println("Key 3 exists in the HashMap: " + containsKey);

        hashMap.remove(4);
        System.out.println("After removing key 4, the HashMap contains: " + hashMap);

    }
}
