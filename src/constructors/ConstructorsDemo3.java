package constructors;

public class ConstructorsDemo3 {
	
	String username, password;
	
	ConstructorsDemo3(){
		username="TestUser";
		password="test@321";
	}

	public static void main(String[] args) {
	
		ConstructorsDemo3 obj=new ConstructorsDemo3();
		
		System.out.println(obj.username+" --- "+obj.password);
		
	}

}
