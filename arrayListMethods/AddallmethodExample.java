package arrayListMethods;

import java.util.ArrayList;
import java.util.HashSet;

public class AddallmethodExample {
	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<> ();
		languages.add("Java");
	    languages.add("Python");
	    languages.add("C++");
	    languages.add("Ruby");
	    System.out.println("Languages: " + languages);

	    // create another arraylist
	    ArrayList<String> programmingLanguages = new ArrayList<>();

	    // add all elements from languages to programmingLang
	    programmingLanguages.addAll(languages);

	    System.out.println("Programming Languages: " + programmingLanguages);
	}

}


//             Inserting Elements using ArrayList addAll()
//public class AddallmethodExample {
//	public static void main(String[] args) {
//
//	    // create an arraylist
//	    ArrayList<Integer> primeNumbers = new ArrayList<>();
//	    // add elements to arraylist
//	    primeNumbers.add(3);
//	    primeNumbers.add(5);
//	    System.out.println("Prime Numbers: " + primeNumbers);
//
//	    // create another arraylist
//	    ArrayList<Integer> numbers = new ArrayList<>();
//	    numbers.add(1);
//	    numbers.add(2);
//
//	    // Add all elements from primeNumbers to numbers
//	    numbers.addAll(primeNumbers);
//
//	    System.out.println("Numbers: " + numbers);
//	  }
//
//}


//            Inserting Elements to the Specified Position
/*public class AddallmethodExample {
	public static void main(String[] args) {
	    ArrayList<String> languages1 = new ArrayList<>();
	    languages1.add("Java");
	    languages1.add("Python");
	    System.out.println("ArrayList 1: " + languages1);

	    // create another arraylist
	    ArrayList<String> languages2 = new ArrayList<>();
	    languages2.add("JavaScript");
	    languages2.add("C");
	    System.out.println("ArrayList 2: " + languages2);

	    // Add elements from languages1 to languages2 at index 1
	    languages2.addAll(1, languages1);

	    System.out.println("Updated ArrayList 2: " + languages2);
	  }
	
}
*/
//                 Inserting Elements from Set to ArrayList
//public class AddallmethodExample {
//	public static void main(String[] args) {
//
//	    // create a hashset of String type
//	    HashSet<String> set = new HashSet<>();
//
//	    // add elements to the hashset
//	    set.add("Java");
//	    set.add("Python");
//	    set.add("JavaScript");
//	    System.out.println("HashSet: " + set);
//
//	    // create an arraylist
//	    ArrayList<String> list = new ArrayList<>();
//
//	    // add element to arraylist
//	    list.add("English");
//	    System.out.println("Initial ArrayList: " + list);
//
//	    // Add all elements from hashset to arraylist
//	    list.addAll(set);
//
//	    System.out.println("Updated ArrayList: " + list);
//	  }
//}



