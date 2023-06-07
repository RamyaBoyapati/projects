package javaMapExamples;

import java.util.WeakHashMap;

public class AccessWeakHashMapExample2 {
	public static void main(String[] args) {
        // Creating WeakHashMap of even numbers
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

        String one = new String("One");
        Integer oneValue = 1;
        numbers.put(one, oneValue);

        String two = new String("Two");
        Integer twoValue = 2;
        numbers.put(two, twoValue);

        System.out.println("WeakHashMap: " + numbers);

        // Using get()
        int value1 = numbers.get("Two");
        System.out.println("Using get(): " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Four", 4);
        System.out.println("Using getOrDefault(): " + value2);

    }

}
