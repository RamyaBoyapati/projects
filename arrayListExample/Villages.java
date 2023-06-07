package arrayListExample;

import java.util.ArrayList;

public class Villages {
	public static void main(String[] args) {
		ArrayList<String> village = new ArrayList<> ();
		village.add(0, "Marakapuram");
		village.add(1, "Dornala");
		village.add(2, "Chinna Dornala");
		village.add(3, "Pedda Dornala");
		System.out.println("all Villages are " +village);
	}

}
