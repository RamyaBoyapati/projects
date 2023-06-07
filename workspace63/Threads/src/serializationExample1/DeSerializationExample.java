package serializationExample1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
 
/**
 * This program is used to show the deserialization process.
 * @author w3spoint
 */
class Student implements Serializable{
	//Serial Version UID.
	private static final long serialVersionUID = 1L;
	String name;
	String className;
	String rollNo;
 
	//Constructor.
	Student(String name, String className, String rollNo){
		this.name = name;
		this.className = className;
		this.rollNo = rollNo;
	}
}
 
class Test{
	//Deserialize a serialize object.
	public void objectDeSerialization(){
	  try
	      {
		Student stu = null;
		//Creating FileOutputStream object.
		FileInputStream fis = 
	         new FileInputStream("F:\\New folder\\student.ser");
 
	         //Creating ObjectOutputStream object.
	         ObjectInputStream ois = new ObjectInputStream(fis);
 
	         //write object.
	         stu = (Student) ois.readObject();
 
	         //close streams.
	         ois.close();
	         fis.close();
 
	         System.out.println("Name = " + stu.name);
	         System.out.println("Class Name = " + stu.className);
	         System.out.println("RollNo = " + stu.rollNo);
	      }catch(Exception e)
	      {
	          System.out.println(e);
	      }
	}
}
 
public class DeSerializationExample {
	public static void main(String args[]){	
		//Creating Test object.
		Test obj = new Test();		
		//Method call.
		obj.objectDeSerialization();		
	}
}