package arrayListMethods;

import java.util.ArrayList;

//public class ArrayListClearMethodExample {
//	public static void main(String[] args) {
//		// create an arraylist
//        ArrayList<String> languages = new ArrayList<>();
//
//        languages.add("Java");
//        languages.add("JavaScript");
//        languages.add("Python");
//        System.out.println("Programming Languages: " + languages);
//
//        // remove all elements
//        languages.clear();
//        System.out.println("ArrayList after clear(): " + languages);
//	}
//
//}

//public class ArrayListClearMethodExample {
//	public static void main(String[] args){
//		ArrayList<Integer> oddNumbers = new ArrayList<> ();
//		// add elements to arraylist
//        oddNumbers.add(1);
//        oddNumbers.add(3);
//        oddNumbers.add(5);
//        System.out.println("Odd Number ArrayList: " + oddNumbers);
//
//        // remove all elements
//        oddNumbers.removeAll(oddNumbers);
//        System.out.println("ArrayList after removeAll(): " + oddNumbers);
//	}
//}



public class ArrayListClearMethodExample {
	public static void main(String[] args){
		ArrayList<Integer> evenNumbers = new ArrayList<> ();
		// add elements to arraylist
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);
        evenNumbers.add(12);
        System.out.println("Even Number ArrayList: " + evenNumbers);

        // remove all elements
        evenNumbers.removeAll(evenNumbers);
        System.out.println("ArrayList after removeAll(): " + evenNumbers);
	}
}

