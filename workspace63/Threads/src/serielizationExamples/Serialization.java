package serielizationExamples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) {
		try{
			Student s1 = new Student(154,"Ramya");
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("sucess");
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
