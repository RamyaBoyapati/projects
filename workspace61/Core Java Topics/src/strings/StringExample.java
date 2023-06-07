package strings;

public class StringExample {
	public static void main(String args[]){    
		String s1="java";//creating string by Java string literal    
		char ch[]={'s','t','r','i','n','g','s'};    
		String s2=new String(ch);//converting char array to string    
		String s3=new String("example");//creating Java string by new keyword    
		System.out.println(s1);    
		System.out.println(s2);    
		System.out.println(s3);    
		}

}
//The above code, converts a char array into a String object. And displays
//the String objects s1, s2, and s3 on console using println() method.