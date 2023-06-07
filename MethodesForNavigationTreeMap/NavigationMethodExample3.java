package MethodesForNavigationTreeMap;

import java.util.TreeMap;

public class NavigationMethodExample3 {
	public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("TreeMap: " + numbers);

        //Using the pollFirstEntry() method
        System.out.println("Using pollFirstEntry(): " + numbers.pollFirstEntry());

        // Using the pollLastEntry() method
        System.out.println("Using pollLastEntry(): " + numbers.pollLastEntry());

        System.out.println("Updated TreeMap: " + numbers);

    }

}
