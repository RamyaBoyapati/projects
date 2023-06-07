package setInterfaceExamples;

import java.util.EnumSet;

public class CreateEnumsetUsingnoneOfExample {
	// an enum type Size
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE

	}
    
    public static void main(String[] args) {

        // Creating an EnumSet using noneOf()
        EnumSet<Size> sizes = EnumSet.noneOf(Size.class);

        System.out.println("Empty EnumSet: " + sizes);
    }

}
