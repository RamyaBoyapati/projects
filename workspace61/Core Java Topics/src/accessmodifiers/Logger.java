package accessmodifiers;

public class Logger {
	void message(){
		System.out.println("This is a message");
	}

}

//Here, the Logger class has the default access modifier. 
//And the class is visible to all the classes that belong to the 
 //defaultPackage package. However, if we try to use the Logger class in
//another class outside of defaultPackage, we will get a compilation error.
