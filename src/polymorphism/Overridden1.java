package polymorphism;

public class Overridden1 {
	
	final int count=10;
	
	//overridden method
	protected void config() {
		System.out.println("config method from Overridden1 class");
	}
	
	Overridden1(){
		
	}
	
	
	static void base() {
		System.out.println("base method from parent class");
	}

}
