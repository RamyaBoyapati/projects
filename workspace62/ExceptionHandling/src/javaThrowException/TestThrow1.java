package javaThrowException;

public class TestThrow1 {
	//function to check if person is eligible to vote or not   
    public static void validate(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function  
        validate(13);  
        System.out.println("rest of the code...");    
  }    

}
//Throwing Unchecked Exception
//In this example, we have created a method named validate() that accepts 
//an integer as a parameter. If the age is less than 18, we are throwing the
//ArithmeticException otherwise print a message welcome to vote.

//Note: If we throw unchecked exception from a method, it is must to handle
//the exception or declare in throws clause.
















