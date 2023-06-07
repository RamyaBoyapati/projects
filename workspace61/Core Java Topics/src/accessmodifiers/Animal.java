package accessmodifiers;

//Animal.java file
//public class
class Public {
 // public variable
 public int legCount;

 // public method
 public void display() {
     System.out.println("I am an animal.");
     System.out.println("I have " + legCount + " legs.");
 }
}

//Main.java
public class Animal {
 public static void main( String[] args ) {
     // accessing the public class
     Public animal = new Public();

     // accessing the public variable
     animal.legCount = 4;
     // accessing the public method
     animal.display();
 }
}
