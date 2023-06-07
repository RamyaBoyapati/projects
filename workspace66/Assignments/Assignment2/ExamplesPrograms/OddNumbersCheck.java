package ExamplesPrograms;

import java.util.Arrays;
import java.util.List;

public class OddNumbersCheck {
	public static void main(String[] args) {
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
	    List<Integer> numbers2 = Arrays.asList(3, 5, 7, 13, 17);
	    boolean isOdd1 = numbers1.parallelStream().allMatch(n -> n % 2 != 0);
	    boolean isOdd2 = numbers2.parallelStream().allMatch(n -> n % 2 != 0);
	     System.out.println(isOdd1);
	     System.out.println(isOdd2); 
	}

}

//The program uses the allMatch method on the parallel stream of integers to 
//check if all of them are odd. The lambda expression (n -> n % 2 != 0) returns true
//if the given integer n is odd, and false otherwise. The allMatch method returns true
//if all the elements of the stream match the given predicate, and false otherwise. 
//Finally, the program prints the results.
