package examplesoftrycatch;

public class JavaExceptionExample {
	
	public static void main(String[] args) {
		try {
			//code that may raise exception  
			int data = 100/0;
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		//rest code of the program   
		System.out.println("The Rest of the code....");
	}

}

//In the above example, 100/0 raises an ArithmeticException which is handled
//by a try-catch block.
