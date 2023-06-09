package javaMapExamples;

import java.util.EnumMap;

//1. Using entrySet(), keySet() and values()
//
//entrySet() - returns a set of all the keys/values mapping (entry) of an enum 
//map
//keySet() - returns a set of all the keys of an enum map
//values() - returns a set of all the values of an enum map
public class AccessEnumMapElementsExample2 {
	enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {

        // Creating an EnumMap of the Size enum
        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
        sizes.put(Size.SMALL, 28);
        sizes.put(Size.MEDIUM, 32);
        sizes.put(Size.LARGE, 36);
        sizes.put(Size.EXTRALARGE, 40);
        System.out.println("EnumMap: " + sizes);

        // Using the entrySet() Method
        System.out.println("Key/Value mappings: " + sizes.entrySet());

        // Using the keySet() Method
        System.out.println("Keys: " + sizes.keySet());

        // Using the values() Method
        System.out.println("Values: " + sizes.values());
    }

}
