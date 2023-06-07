package polymorphism;

//Java Program for Method Overriding

//Class 1
//Helper class
class Parent {

 // Method of parent class
 void Print()
 {

     // Print statement
     System.out.println("parent class");
 }
}

//Class 2
//Helper class
class subclass1 extends Parent {

 // Method
 void Print() { System.out.println("Hiii"); }
}

//Class 3
//Helper class
class subclass2 extends Parent {

 // Method
 void Print()
 {

     // Print statement
     System.out.println("Hello");
 }
}

//Class 4
//Main class
class Polymorphism {

 // Main driver method
 public static void main(String[] args)
 {

     // Creating object of class 1
     Parent a;

     // Now we will be calling print methods
     // inside main() method

     a = new subclass1();
     a.Print();

     a = new subclass2();
     a.Print();
 }
}