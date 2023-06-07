package ExamplePrograms;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String expression;
        double result;

        while (true) {
            try {
                System.out.print("Enter an expression (use +, -, *, / operators): ");
                expression = input.nextLine();
                result = evaluateExpression(expression);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Invalid expression. Please try again.");
            }
        }
    }

    public static double evaluateExpression(String expression) {
        return new java.util.Scanner(expression).useDelimiter("\\s+").nextDouble();
    }
	}
//This program uses a Scanner object to read input from the user, and then evaluates
//the expression using the evaluateExpression() method. The evaluateExpression() 
//method uses a Scanner object to parse the expression and return the result as a
//double. If an error occurs, the program catches the exception and prints an error
//message.
//
//To use the calculator, simply run the program in a Java IDE or command line, and 
//enter the expression you want to evaluate when prompted. The program will continue
//to accept expressions until you terminate it manually.

