package abstraction;

public class InterfaceTest implements Interface1,Interface2{

	int count=100;
	
	public void click() {
		System.out.println("click method implementation");
	}

	
	public void sendKeys() {
		System.out.println("sendKeys method implementation");
	}
	
	
	public void getElement() {
		System.out.println("getElement method in class");
	}
	
	public void get() {
		
	}
	
	public void manage() {
		
	}
	public void maximize() {
		
	}
	
	
	public static void main(String[] args) {
		Interface1 obj=new InterfaceTest();
		obj.click();
		obj.sendKeys();
		obj.display();
		Interface1.getText();
		System.out.println(Interface1.age);
		
		InterfaceTest obj2=new InterfaceTest();
		obj2.click();
		obj2.sendKeys();
		obj2.display();
		obj2.getElement();
		
		System.out.println(obj2.count);
		System.out.println(Interface1.age);
		Interface1.getText();
		
		
		
		
	}

}
