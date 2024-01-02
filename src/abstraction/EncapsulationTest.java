package abstraction;

public class EncapsulationTest {
	
	
	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		obj.setUserName("TestUser");
		obj.setPassword("Test$321");
		
		
		System.out.println(obj.getUserName());
		System.out.println(obj.getPassword());
		
		
	}

}
