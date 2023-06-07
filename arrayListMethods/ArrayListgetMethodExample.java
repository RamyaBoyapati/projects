package arrayListMethods;

import java.util.ArrayList;

//ArrayList get() method returns the element present in specified position.
//public class ArrayListgetMethodExample {
//	public static void main(String[] args) {
//        // create an ArrayList
//        ArrayList<String> languages = new ArrayList<>();
//
//        // insert element to the arraylist
//        languages.add("JavaScript");
//        languages.add("Java");
//        languages.add("Python");
//        System.out.println("Programming Languages: " + languages);
//
//        // access element at index 1
//        String element = languages.get(1);
//        System.out.println("Element at index 1: " + element);
//    }
//
//}

public class ArrayListgetMethodExample{
	public static void main(String[] args) {
        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // insert element to the arraylist
        numbers.add(22);
        numbers.add(13);
        numbers.add(35);
        System.out.println("Numbers ArrayList: " + numbers);

        // return element at position 2
        int element = numbers.get(2);
        System.out.println("Element at index 2: " + element);
    }
}
