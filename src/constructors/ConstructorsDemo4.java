package constructors;

public class ConstructorsDemo4 {
	
	//instance variables
	String username, password;
	
	ConstructorsDemo4(String username, String password){ //local variables
		
		this.username=username;
		this.password=password;
		
		
	}
	
	//instance method
	void login() {
		System.out.println(username+" --- "+password);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorsDemo4 obj=new ConstructorsDemo4("TestUser","test$321");
		
		obj.login();
		
		
		
		
		
	}

}
