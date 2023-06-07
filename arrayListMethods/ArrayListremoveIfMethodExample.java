package arrayListMethods;

import java.util.ArrayList;

public class ArrayListremoveIfMethodExample {
	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Numbers: " + numbers);
        numbers.removeIf(e -> (e % 2) == 0);;
        System.out.println("Odd Numbers: " + numbers);
	}

}
