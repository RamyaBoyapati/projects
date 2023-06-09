package LambdaExpressionExample;

interface Addable{
	int addition(int a, int b);
}
class Adding implements Addable{

	
	public int addition(int a, int b) {
		return (a + b);
	}
	
}
public class LambdaParameters {
	public static void main(String[] args) {
		Addable addition = (int a,int b)-> (a+b);
		int result = addition.addition(10, 20);
		System.out.println(result);
	}

}
