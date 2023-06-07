package arrayListMethods;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorMethodExample {
	public static void main(String[] args){
	    ArrayList<String> languages = new ArrayList<>();
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("JavaScript");
	    languages.add("Swift");

	    // Create a variable of Iterator
	    // store the iterator returned by iterator()
	    Iterator<String> iterate = languages.iterator();
	    System.out.print("ArrayList : ");
	    while(iterate.hasNext()){
	      System.out.print(iterate.next());
	      System.out.print(", ");
	    }
	  }

}
