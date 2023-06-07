package arrayListMethods;

import java.util.ArrayList;


   //  ArrayList clone() method makes the shallow copy of an array list.
//public class ArrayListCloneMethodExample {
//	public static void main(String[] args){
//
//        // create an arraylist
//        ArrayList<Integer> number = new ArrayList<>();
//
//        number.add(1);
//        number.add(3);
//        number.add(5);
//        System.out.println("ArrayList: " + number);
//
//        // create copy of number
//        ArrayList<Integer> cloneNumber = (ArrayList<Integer>)number.clone();
//        System.out.println("Cloned ArrayList: " + cloneNumber);
//    }
//
//}


    //print the return clone() method Example 
public class ArrayListCloneMethodExample {
	public static void main(String[] args){

        // create an arraylist
        ArrayList<Integer> prime = new ArrayList<>();
        prime.add(2);
        prime.add(3);
        prime.add(5);
        System.out.println("Prime Number: " + prime);

        // print the return value of clone()
        System.out.println("Return value of clone(): " + prime.clone());
    }
	
}



