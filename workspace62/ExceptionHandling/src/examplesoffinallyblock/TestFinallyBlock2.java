package examplesoffinallyblock;

public class TestFinallyBlock2 {
	public static void main(String args[]){   
		  
	      try {    
	  
	        System.out.println("Inside try block");  
	  
	        //below code throws divide by zero exception  
	       int data=25/0;    
	       System.out.println(data);    
	      }   
	  
	      //handles the Arithmetic Exception / Divide by zero exception  
	      catch(ArithmeticException e){  
	        System.out.println("Exception handled");  
	        System.out.println(e);  
	      }   
	  
	      //executes regardless of exception occured or not   
	      finally {  
	        System.out.println("finally block is always executed");  
	      }    
	  
	      System.out.println("rest of the code...");    
	      }    

}
//When an exception occurs and is handled by the catch block
//the following example where the Java code throws an exception and the 
//catch block handles the exception. Later the finally block is executed 
//after the try-catch block. Further, the rest of the code is also executed 
//normally.

//Rule :Rule: For each try block there can be zero or more catch blocks, but
//only one finally block.

//Note: The finally block will not be executed if the program exits 
//(either by calling System.exit() or by causing a fatal error that causes 
//the process to abort).














