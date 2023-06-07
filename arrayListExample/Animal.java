package arrayListExample;

import java.util.ArrayList;

public class Animal {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<> ();
		//Add Elements 
		animals.add("Dog");
		animals.add("Elephent");
		animals.add("Fox");
		
		System.out.println("Animals are the " +animals);
		//Access Elements
		String s = animals.get(1);
		System.out.println("Elements is : "+s );
		//Change Elements
		animals.set(2, "Buffelo");
		System.out.println("List is : " +animals);
		//remove Elements
		String s1 = animals.remove(1);
		System.out.println("List " +animals);
		System.out.println("Removed Element  : " +animals);
	}

}
