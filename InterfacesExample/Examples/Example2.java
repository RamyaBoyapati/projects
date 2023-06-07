package Examples;

//create an interface
interface Language {
void getName(String name);
}

//class implements interface
class ProgrammingLanguage implements Language {

// implementation of abstract method
public void getName(String name) {
 System.out.println("Programming Language: " + name);
}
}
public class Example2 {
	public static void main(String[] args) {
		ProgrammingLanguage language = new ProgrammingLanguage();
	    language.getName("Java");
	}

}
//n the above example, we have created an interface named Language.
//The interface includes an abstract method getName().
