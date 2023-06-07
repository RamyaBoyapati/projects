package javaMapExamples;

//1. Using entrySet(), keySet() and values()
//
//entrySet() - returns a set of all the key/value mapping of the map
//keySet() - returns a set of all the keys of the map
//values() - returns a set of all the values of the map


import java.util.LinkedHashMap;

public class AccessLinkedHashMapExample {
	public static void main(String[] args) {
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap: " + numbers);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());
    }

}
