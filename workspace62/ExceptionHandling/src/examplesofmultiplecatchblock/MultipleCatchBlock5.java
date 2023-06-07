package examplesofmultiplecatchblock;

public class MultipleCatchBlock5 {
	public static void main(String args[]) throws ArithmeticException, ArrayIndexOutOfBoundsException{    
		   try{    
		    int a[]=new int[5];    
		    a[5]=30/0;    
		   }    
		   catch(Exception e){System.out.println("common task completed");}    
		   System.out.println("rest of the code...");    
		 }    

}
