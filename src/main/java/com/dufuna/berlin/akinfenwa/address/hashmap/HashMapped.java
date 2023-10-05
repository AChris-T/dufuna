package com.dufuna.berlin.akinfenwa.address.hashmap;

import java.util.HashMap;

public class HashMapped {
    public static void main(String[] args) {
        // Create a new HashMapped with Integer keys and String values
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put(1, "Alice");
        hashMap.put(2, "Bob");
        hashMap.put(3, "Charlie");
        hashMap.put(4, "David");

        // Retrieve values from the HashMap based on keys
        String value1 = hashMap.get(1);
        String value2 = hashMap.get(2);
        // Check if a key exists in the HashMapped
        System.out.println("Value associated with key 1: " + value1); // Output: Alice
        System.out.println("Value associated with key 2: " + value2); // Output: Bob

        // Check if a key exists in the HashMap
        boolean containsKey = hashMap.containsKey(3);
        System.out.println("Key 3 exists in the HashMap: " + containsKey); // Output: true

        // Remove a key-value pair from the HashMap
        hashMap.remove(4);
        System.out.println("After removing key 4, the HashMap contains: " + hashMap); // Output: {1=Alice, 2=Bob, 3=Charlie}

    }
}
