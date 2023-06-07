package arrayListMethods;

import java.util.ArrayList;

//remove() method removes the single element from the arraylist.
public class ArrayListremoveMethodExample {
	public static void main(String[] args) {
		ArrayList<Integer> primeNumbers = new ArrayList<>();
	    primeNumbers.add(2);
	    primeNumbers.add(3);
	    primeNumbers.add(5);
	    System.out.println("ArrayList: " + primeNumbers);

	    // remove element at index 2
	    int removedElement = primeNumbers.remove(2);

	    System.out.println("Removed Element: " + removedElement);
	}

}

//public class ArrayListremoveMethodExample {
//	public static void main(String[] args) {
//		ArrayList<String> languages = new ArrayList<>();
//		languages.add("Java");
//		languages.add("Python");
//		languages.add("C++");
//	    System.out.println("ArrayList: " + languages);
//
//	    // remove element at index 2
//	    String removedElement = languages.remove(1);
//
//	    System.out.println("Removed Element: " + removedElement);
//	}
//
//}

//           Remove the Specified Element from the ArrayList




//public class ArrayListremoveMethodExample {
//	public static void main(String[] args) {
//		// create an ArrayList
//	    ArrayList<String> languages = new ArrayList<>();
//
//	    // insert element to the arraylist
//	    languages.add("JavaScript");
//	    languages.add("Java");
//	    languages.add("Python");
//	    System.out.println("ArrayList: " + languages);
//
//	    // remove the element Java
//	    boolean result = languages.remove("Java");
//
//	    System.out.println("Is element Java removed? " + result);
//	    System.out.println("ArrayList after remove(): " + languages);
//	}
//	
//}


//   Remove the Element From the Specified Position




//public class ArrayListremoveMethodExample {
//	public static void main(String[] args) {
//		ArrayList<String> languages = new ArrayList<>();
//
//	    // insert element to the arraylist
//	    languages.add("JavaScript");
//	    languages.add("Java");
//	    languages.add("Python");
//	    System.out.println("ArrayList: " + languages);
//
//	    // remove the element from position 2
//	    String element = languages.remove(2);
//
//	    System.out.println("ArrayList after remove(): " + languages);
//	    System.out.println("Removed Element: " + element);	
//	}
//}


//         Remove the First Occurrence of the Element
//public class ArrayListremoveMethodExample {
//	public static void main(String[] args) {
//		// create an ArrayList
//	    ArrayList<Integer> randomNumbers = new ArrayList<>();
//
//	    // add element to the arraylist
//	    randomNumbers.add(22);
//	    randomNumbers.add(13);
//	    randomNumbers.add(35);
//	    randomNumbers.add(13);
//	    randomNumbers.add(40);
//	    System.out.println("ArrayList: " + randomNumbers);
//
//	    // remove the first occurrence of 13
//	    boolean result = randomNumbers.remove(Integer.valueOf(13));
//
//	    System.out.println("Is element 13 removed? " + result);
//	    System.out.println("ArrayList after remove(): " + randomNumbers);
//	}
//}







