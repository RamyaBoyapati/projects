package arrayListMethods;

import java.util.ArrayList;


//returns true if the specified element is present in the arraylist.
//returns false if the specified element is not present in the arraylist.

//public class ArrayListContainsMethodExample {
//	public static void main(String[] args) {
//		ArrayList<Integer> numbers = new ArrayList<> ();
//		numbers.add(2);
//		numbers.add(3);
//		numbers.add(5);
//		numbers.add(7);
//		numbers.add(8);
//		numbers.add(9);
//		System.out.println("Number ArrayList: " + numbers);
//
//        // checks if 3 is present in the arraylist
//        System.out.print("Is 3 present in the arraylist: ");
//        System.out.println(numbers.contains(3));
//
//
//        // checks if 1 is present in the arraylist
//        System.out.print("Is 1 present in the arraylist: ");
//        System.out.println(numbers.contains(1));
//	}
//
//}

public class ArrayListContainsMethodExample {
	public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // insert element to the arraylist
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        System.out.println("Programming Languages: " + languages);

        // checks if Java is present in languages
        System.out.print("Is Java present in the arraylist: ");
        System.out.println(languages.contains("Java"));


        // checks if C++ is present in languages
        System.out.print("Is C++ present in the arraylist: ");
        System.out.println(languages.contains("C++"));

    }
}



