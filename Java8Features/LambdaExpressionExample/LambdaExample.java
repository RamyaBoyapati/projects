package LambdaExpressionExample;

interface Shape{
	 void draw();
}
class Rectangle implements Shape{

	public void draw() {
		System.out.println("Rectangle class : draw() mathod");
		
		
		
	}
	
}
//class Square implements Shape{
//
//	public void draw() {
//		System.out.println("Square class : draw() method");
//		
//	}
//	
//}

public class LambdaExample {
	public static void main(String[] args) {
		
	
	Shape rectangle=()->{
		Rectangle r = new Rectangle();
		r.draw();
		
	};
	rectangle.draw();
//	 Shape square = ()-> System.out.println("Square class : draw() method");
//	    square.draw();
	   
	}

	
}
