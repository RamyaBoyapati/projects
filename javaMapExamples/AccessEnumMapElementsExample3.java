package javaMapExamples;
//2. Using the get() Method
//The get() method returns the value associated with the specified key. 
//It returns null if the specified key is not found.
import java.util.EnumMap;

public class AccessEnumMapElementsExample3 {
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

        // Using the get() Method
        int value = sizes.get(Size.MEDIUM);
        System.out.println("Value of MEDIUM: " + value);
    }

}
