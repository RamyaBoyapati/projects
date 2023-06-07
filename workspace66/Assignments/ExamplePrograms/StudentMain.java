import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentMain {
public static void main(String[] args) {
	
		Student student1= new Student(1,"ramya");
		Student student2= new Student(2, "Supriya");
	 Map<Student,Student> mapStudent= new HashMap<>();
	 
	 mapStudent.put(student1,student1);
	 mapStudent.put(student2,student2);
	 mapStudent.forEach((key, value) -> {
		    System.out.println("Student ID: " + key.getId());
		    System.out.println("Student Name: " + value.getName());
		});
	 

	 }
}
