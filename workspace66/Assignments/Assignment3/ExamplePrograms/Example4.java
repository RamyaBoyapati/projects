package ExamplePrograms;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		char operator;
		double num1,num2,num3,result;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an Operator : +,-,* or /");
		operator = input.next().charAt(0);
		System.out.println("Enter The First Number");
		num1=input.nextDouble();
		System.out.println("Enter The Second  Number");
		num2=input.nextDouble();
		System.out.println("Enter The Third Number");
		num3=input.nextDouble();
		switch(operator){
		case '+' :
			result = num1 + num2 + num3;
			System.out.println(num1+"+"+num2+"+"+num3+"="+result);
			break;
		}
		input.close();
	}

}
