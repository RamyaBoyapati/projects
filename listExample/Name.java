package listExample;

import java.util.ArrayList;
import java.util.List;

public class Name {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer> ();
		List<String> names = new ArrayList<> ();
		l.add(100);
		l.add(200);
		l.add(300);
		names.add(0, "Ramya");
		names.add(1,"Akhila");
		names.add(2,"Usha");
		System.out.println("integers are" +l);
		System.out.println("The Names are " +names);
	}

}
