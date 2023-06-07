package ExamplesPrograms;

public class ReplaceNonAlphanumeric {
	public static void main(String[] args) {
		String input = " Hello Supriya Welcome To Infinite And Congraulations ";
	    String output = input.replaceAll("[^a-zA-Z0-9]", "");
	    System.out.println(output);
	}

}
//In this example, we use the replaceAll method on the input string to replace 
//all non-alphanumeric characters with empty strings. The regular 
//expression [^a-zA-Z0-9] matches any character that is not a letter or a digit. 
//The ^ symbol inside the square brackets means negation, so the regular expression
//matches any character that is not in the range of a-z, A-Z, or 0-9. Finally, we 
//print the output string that contains only alphanumeric characters.
//public class ReplaceAlphaNumericExample{
//	public static void main(String[] args){
//		String input = "Hi Ramya";
//		String output = input.replaceAll("[a-zA-Z0-9]","");
//		System.out.println(output);
//		
//	}
//}


//public class ReplaceNonAlphaNumeric{
//	public static void main(String[] args){
//		String input = "Hello Supriya";
//		String output = input.replace("[a-zA-Z0-9]","");
//		System.out.println(output);
//	}
//}