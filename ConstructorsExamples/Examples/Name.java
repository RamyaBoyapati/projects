package Examples;

public class Name {
	private String name;

	  // constructor
	  Name() {
	    System.out.println("Constructor Called:");
	    name = "Programiz";
	  }

	  public static void main(String[] args) {

	    // constructor is invoked while
	    // creating an object of the Main class
	    Name obj = new Name();
	    System.out.println("The name is " + obj.name);
	  }

}
