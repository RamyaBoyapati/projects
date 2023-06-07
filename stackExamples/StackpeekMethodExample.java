package stackExamples;

import java.util.Stack;

//The peek() method returns an object from the top of the stack.
public class StackpeekMethodExample {
	public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        // Access element from the top
        String element = animals.peek();
        System.out.println("Element at top: " + element);

    }

}
