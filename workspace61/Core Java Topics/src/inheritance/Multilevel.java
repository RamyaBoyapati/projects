package inheritance;
class Shapee {
	   public void display() {
	      System.out.println("Inside display");
	   }
	}
	class Rectanglee extends Shapee {
	   public void area() {
	      System.out.println("Inside area");
	   }
	}
	class Cube extends Rectanglee {
	   public void volume() {
	      System.out.println("Inside volume");
	   }
	}
	public class Multilevel {
	   public static void main(String[] arguments) {
	      Cube cube = new Cube();
	      cube.display();
	      cube.area();
	      cube.volume();
	   }
	}
