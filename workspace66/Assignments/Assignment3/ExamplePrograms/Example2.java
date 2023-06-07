package ExamplePrograms;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		char Operator;
		int number1, number2, number3, result;
		Scanner input = new Scanner(System.in);
		System.out.println("choose an operator: +,-,*, or /");
		Operator = input.next().charAt(0);
		System.out.println("Enter First Number");
		number1=input.nextInt();
		System.out.println("Enter Second Number");
		number2=input.nextInt();
		System.out.println("Enter Third Number");
		number3=input.nextInt();
		switch(Operator){
		case '+' :
			result = number1+number2+number3;
			System.out.println(number1+"+" +number2+ "+" +number3+ "=" +result);
			break;
			//System.out.println(number1+"+" +number2+"+"+number3+" = "+result);
			default :
				System.out.println("Invalid Operator!");
				break;
		}
		input.close();
		
	}

}
