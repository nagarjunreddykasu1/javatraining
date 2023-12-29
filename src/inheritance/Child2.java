package inheritance;

public class Child2 extends Child1{
	
	
	void info() {
		System.out.println("info method");
	}
	
	public static void main(String[] args) {
		
		
		Child2 obj=new Child2();
		obj.click();
		obj.display();
		obj.login();
		obj.info();
		
	}
	
	

}
