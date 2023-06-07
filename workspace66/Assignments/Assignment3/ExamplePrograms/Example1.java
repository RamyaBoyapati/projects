package ExamplePrograms;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {

	    char operator;
	    int  number1, number2, number3, result;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, % or /");
	    operator = input.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    number1 = input.nextInt();

	    System.out.println("Enter second number");
	    number2 = input.nextInt();
	    
	    System.out.println("Enter Third number");
	    number3 = input.nextInt();

	    switch (operator) {

	      // performs addition between numbers
	      case '+':
	        result = number1 + number2 + number3;
	        System.out.println(number1+"+" +number2+"+"+number3+" = "+result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = number1 - number2 - number3;
	        System.out.println(number1 + " - " + number2 + "-" +number3+ " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = number1 * number2 * number3;
	        System.out.println(number1 + " * " + number2 + "*" +number3+ " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = number1 / number2 / number3;
	        System.out.println(number1 + " / " + number2 + "/" +number3+  " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	  }


}
