package inheritance;

class Server{
	   void my_frontend(){
	      System.out.println("Connection to frontend established successfully");}
	   }
	   class Java extends Server{
	      void my_backend(){
	         System.out.println("Connection to backend established successfully");
	      }
	   }
	   class connection extends Java{
	      void my_database(){
	         System.out.println("Connection to database established successfully");
	      }
	   }
	   public class My_test{
	      public static void main(String args[]){
	         connection my_connection=new connection();
	         my_connection.my_database();
	         my_connection.my_backend();
	         my_connection.my_frontend();
	   }
	}