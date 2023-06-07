package ExamplePrograms;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression;
        while (true) {
            try {
                System.out.print("Enter a mathematical expression: ");
                expression = scanner.nextLine();
                double result = evaluateExpression(expression);
                System.out.println("Result: " + result);
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("Invalid expression. Please try again.");
            } catch (Exception e) {
                System.out.println("An error occurred. Please try again.");
            }
        }
    }

    private static double evaluateExpression(String expression) {
        String[] tokens = expression.split("\\s+");
        double result = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            char operator = tokens[i].charAt(0);
            double operand = Double.parseDouble(tokens[i + 1]);
            switch (operator) {
                case '+':
                    result += operand;
                    break;
                case '-':
                    result -= operand;
                    break;
                case '*':
                    result *= operand;
                    break;
                case '/':
                    result /= operand;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }
        return result;
    }

}
