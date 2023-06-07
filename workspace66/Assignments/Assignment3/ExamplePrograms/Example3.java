package ExamplePrograms;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		char operator;
		Double num1,num2,num3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Operatot(+,-,*,/)");
		operator = input.next().charAt(0);
		System.out.println("Enter the Three Numbers one by one");
		num1=input.nextDouble();
		num2=input.nextDouble();
		num3=input.nextDouble();
		input.close();
		switch(operator){
		case '+' :
			System.out.printf("%.1f+%.1f+%.1f=%.1f",num1,num2,num3,(num1+num2+num3));
			break;
		default :
			System.out.printf("%c is an Invalid operator",operator);
		}
		
		
	}

}
