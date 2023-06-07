package arrayListMethods;

import java.util.ArrayList;

public class ArrayListlastIndexOfMethodExample {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();

        // insert element to the ArrayList
        languages.add("JavaScript");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Java");
        System.out.println("Programming Languages: " + languages);

        // get the position of Java occurred last
        int position1 = languages.lastIndexOf("Java");
        System.out.println("Last Occurrence of Java: " + position1);

        // C is not in the ArrayList
        // Returns -1
        int position2 = languages.lastIndexOf("C");
        System.out.println("Last Occurrence of C: " + position2);
	}

}
