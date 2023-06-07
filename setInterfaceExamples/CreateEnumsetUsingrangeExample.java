package setInterfaceExamples;

import java.util.EnumSet;

public class CreateEnumsetUsingrangeExample {
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE

	}

    public static void main(String[] args) {

        // Creating an EnumSet using range()
        EnumSet<Size> sizes = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);

        System.out.println("EnumSet: " + sizes);
    }

}
