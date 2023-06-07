package arrayListMethods;

import java.util.ArrayList;

public class AddExample3 {
	public static void main(String[] args) {
		ArrayList<String> Villages = new ArrayList<> ();
		Villages.add("Marakapuram");
		Villages.add("Kunta");
		Villages.add("Ongole");
		Villages.add("Hyd");
		System.out.println("Villages " +Villages);
		
		//Inserting the Elements Specified Position 
		
		Villages.add(4,"JammiDornala");
		System.out.println("new village adding " +Villages);
	}

}
