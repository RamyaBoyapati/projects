
public class Calculate {
	int a;  
	int b;  
	  
	   // constructor to instantiate  
	   public Calculate (int x, int y) {  
	      this.a = x;  
	      this.b = y;  
	   }  
	  
	   // method to add numbers  
	   public int add () {  
	      int res = a + b;  
	      return res;  
	   }  
	  
	   // method to subtract numbers  
	   public int subtract () {  
	      int res = a - b;  
	      return res;  
	   }  
	  
	   // method to multiply numbers  
	   public int multiply () {  
	      int res = a * b;  
	      return res;  
	   }  
	  
	   // method to divide numbers  
	   public int divide () {  
	      int res = a / b;  
	      return res;  
	   }  
	  
	  
	   // main method  
	   public static void main(String[] args) {  
	      // creating object of Class  
	      Calculate c1 = new Calculate(45, 4);  
	        
	      // calling the methods of Calculate class  
	      System.out.println("Addition is :" + c1.add());  
	      System.out.println("Subtraction is :" + c1.subtract());  
	      System.out.println("Multiplication is :" + c1.multiply());  
	      System.out.println("Division is :" + c1.divide());  
	  
	  
	   }

}
