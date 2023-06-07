package Examples;

public class ParameterizedConstructorExample {
	String languages;

	  // constructor accepting single value
	ParameterizedConstructorExample(String lang) {
	    languages = lang;
	    System.out.println(languages + " Programming Language");
	  }

	  public static void main(String[] args) {

	    // call constructor by passing a single value
		  ParameterizedConstructorExample obj1 = new ParameterizedConstructorExample("Java");
		  ParameterizedConstructorExample obj2 = new ParameterizedConstructorExample("Python");
		  ParameterizedConstructorExample obj3 = new ParameterizedConstructorExample ("C");
	  }

}
