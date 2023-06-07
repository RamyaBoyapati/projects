package arrayListMethods;

import java.util.ArrayList;

public class ArrayListforEachMethodExample {
	public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<>();
	    numbers.add(2);
	    numbers.add(4);
	    numbers.add(6);
	    numbers.add(10);
	    System.out.println("ArrayList: " + numbers);

	    System.out.print("Updated ArrayList: ");

	    // multiply each element by themselves
	    // to compute the square of the number
	    numbers.forEach((e) -> {
	      e = e * e;
	      System.out.print(e + " ");
	    });
	}

}
