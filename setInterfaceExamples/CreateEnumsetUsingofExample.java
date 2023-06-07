package setInterfaceExamples;

import java.util.EnumSet;

public class CreateEnumsetUsingofExample {
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE

	}

    public static void main(String[] args) {

        // Using of() with a single parameter
    	System.out.println("Hello");
        EnumSet<Size> sizes1 = EnumSet.of(Size.MEDIUM);
        System.out.println("EnumSet1: " + sizes1);

        EnumSet<Size> sizes2 = EnumSet.of(Size.SMALL, Size.LARGE);
        System.out.println("EnumSet2: " + sizes2);
    }

}
