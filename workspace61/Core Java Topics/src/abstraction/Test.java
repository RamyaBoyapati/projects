package abstraction;

interface A{
	void a();
	void b();
	void c();
	void d();
}

 class B implements A{
	public void a(){
		System.out.println(" I am in a ");
	}
	public void b(){
		System.out.println(" I am in b ");
	}
	public void c(){
		System.out.println(" I am in c ");
	}
	public void d(){
		System.out.println(" I am in d ");
	}
	
	
}
public class Test {
	public static void main(String[] args) {
		A a=new B();
		a.a();
		a.b();
		a.c();
		a.d();
		
	}

}
