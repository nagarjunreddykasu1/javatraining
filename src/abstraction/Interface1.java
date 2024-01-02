package abstraction;

public interface Interface1 {
	
	int age=30;//all the variabls in interface are public static final... public static final int age=30;
	
	void click();//all methods are public and abstract public abstract void click();
	
	public abstract void sendKeys();
	
	
	default void display() {
		System.out.println("display method from interface");
	}
	
	public static void getText() {
		System.out.println("getText method from interface");
	}
	
	
	private void get() {
		System.out.println("get method from interface");
	}

}
