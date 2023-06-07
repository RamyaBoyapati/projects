package arrayListMethods;

import java.util.ArrayList;

//ArrayList indexOf() method returns the position of the specified element

public class ArrayListindexOfExample {
	public static void main(String[] args) {
        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // insert element to the arraylist
        numbers.add(22);
        numbers.add(13);
        numbers.add(35);
        System.out.println("Number ArrayList: " + numbers);

        // find the position of 13
        int position1 = numbers.indexOf(13);
        System.out.println("Index of 13: " + position1);

        // find the position of 50
        int position2 = numbers.indexOf(50);
        System.out.println("Index of 50: " + position2);
    }
	
}

//public class ArrayListindexOfExample {
//	public static void main(String[] args) {
//        // create an ArrayList
//        ArrayList<String> languages = new ArrayList<>();
//
//        // insert element to the arraylist
//        languages.add("JavaScript");
//        languages.add("Python");
//        languages.add("Java");
//        languages.add("C++");
//        languages.add("Ruby");
//        System.out.println("Programming Languages: " + languages);
//
//        // get the position of Java
//        int position = languages.indexOf("Java");
//        System.out.println("First Occurrence of Java: " + position);
//    }
//}
