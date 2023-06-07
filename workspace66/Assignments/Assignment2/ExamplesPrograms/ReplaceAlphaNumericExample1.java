package ExamplesPrograms;

public class ReplaceAlphaNumericExample1 {
	public static void main(String[] args) {
		String input = "Welcome to infinte";
		//String output = input.replaceAll("[^a-zA-Z0-9]","");
		//String output1 = input.replace("[^a-zA-Z0-9]","");
		//System.out.println(output);
		//System.out.println(output1);
		//String output2 = input.replaceFirst("[^a-zA-Z0-9]","");
		//System.out.println(output2);
		String output3 = input.replace("[^a-zA-Z0-9]","");
		System.out.println(output3);
	}

}
