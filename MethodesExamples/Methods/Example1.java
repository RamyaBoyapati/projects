package Methods;

public class Example1 {
	// create a method
	  public int addNumbers(int a, int b) {
	    int sum = a + b;
	    // return value
	    return sum;
	  }

	  public static void main(String[] args) {
	    
	    int num1 = 25;
	    int num2 = 15;

	    // create an object of Main
	    Example1 obj = new Example1();
	    // calling method
	    int result = obj.addNumbers(num1, num2);
	    System.out.println("Sum is: " + result);
	  }

}
