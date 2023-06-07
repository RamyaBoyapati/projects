package Examples;

public class PublicNoArgumentConstructorExample {
	String name;

	  // public constructor
	  public PublicNoArgumentConstructorExample() {
	    name = "Programiz";
	  }
	}

	class Main {
	  public static void main(String[] args) {

	    // object is created in another class
		  PublicNoArgumentConstructorExample obj = new PublicNoArgumentConstructorExample();
	    System.out.println("Company name = " + obj.name);
	  }

}
