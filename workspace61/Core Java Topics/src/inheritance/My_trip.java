package inheritance;

interface My_restaurents {
	   void eat();
	}
	interface My_journey {
	   void travel();
	}
	class Holiday implements My_restaurents, My_journey {
	   public void eat() {
	      System.out.println("I am trying this food");
	   }
	   public void travel() {
	      System.out.println("I am trying this route");
	   }
	}
	public class My_trip {
	   public static void main(String args[]) {
	      Holiday my_schedule = new Holiday();
	      my_schedule.eat();
	      my_schedule.travel();
	   }
	}