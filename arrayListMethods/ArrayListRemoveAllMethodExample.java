package arrayListMethods;

import java.util.ArrayList;
import java.util.HashSet;

//removeAll() method removes all the elements from the arraylist that are also
//present in the specified collection.
public class ArrayListRemoveAllMethodExample {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();

        // add elements to arraylist
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        System.out.println("Programming Languages: " + languages);

        // remove all elements from arraylist
        languages.removeAll(languages);
        System.out.println("ArrayList after removeAll(): " + languages);
		
	}

}


//Remove all Elements from an ArrayList Present in Another ArrayList




//public class ArrayListRemoveAllMethodExample {
//
//	public static void main(String[] args) {
//		ArrayList<String> languages1 = new ArrayList<>();
//
//        // insert element at the end of arraylist
//        languages1.add("Java");
//        languages1.add("English");
//        languages1.add("C");
//        languages1.add("Spanish");
//        System.out.println("Languages1: " + languages1);
//
//        // create another arraylist
//        ArrayList<String> languages2 = new ArrayList<>();
//
//        // add elements to the arraylist
//        languages2.add("English");
//        languages2.add("Spanish");
//        System.out.println("Languages2: " + languages2);
//
//        // remove all elements of ArrayList2 from ArrayList1
//        languages1.removeAll(languages2);
//        System.out.println("Languages1 after removeAll(): " + languages1);	
//
//	}
//}

//         Remove all Elements from an ArrayList Present in a HashSet




//public class ArrayListRemoveAllMethodExample {
//
//	public static void main(String[] args) {
//		
//		// create an ArrayList
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        // add element to ArrayList
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        System.out.println("ArrayList: " + numbers);
//
//        // create a HashSet
//        HashSet<Integer> primeNumbers = new HashSet<>();
//
//        // add elements to the HashSet
//        primeNumbers.add(2);
//        primeNumbers.add(3);
//        System.out.println("HashSet: " + primeNumbers);
//
//        // remove all elements of HashSet from ArrayList
//        numbers.removeAll(primeNumbers);
//        System.out.println("ArrayList after removeAll(): " + numbers);
//
//		
//	}
//}


