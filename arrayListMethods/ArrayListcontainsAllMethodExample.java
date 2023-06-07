package arrayListMethods;

import java.util.ArrayList;

public class ArrayListcontainsAllMethodExample {
	public static void main(String[] args) {
		// create an ArrayList
        ArrayList<String> languages1 = new ArrayList<>();

        // insert element to the ArrayList
        languages1.add("JavaScript");
        languages1.add("Python");
        languages1.add("Java");
        System.out.println("ArrayList 1: " + languages1);

        // create another ArrayList
        ArrayList<String> languages2 = new ArrayList<>();

        // add elements to ArrayList
        languages2.add("Java");
        languages2.add("Python");
        System.out.println("ArrayList 2: " + languages2);

        // check if ArrayList 1 contains ArrayList 2
        boolean result1 = languages1.containsAll(languages2);
        System.out.println("ArrayList 1 contains all elements of ArrayList 2: " + result1);

        // check if ArrayList 2 contains ArrayList 1
        boolean result2 = languages2.containsAll(languages1);
        System.out.println("ArrayList 2 contains all elements of ArrayList 1: " + result2);

	}

}
