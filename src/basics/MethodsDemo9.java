package basics;

public class MethodsDemo9 {
	//instance variables
	String username, password;
	
	//instance method
	void credentials(String username, String password) { //local variables
		System.out.println(username+" --- "+password);
		
		this.username=username;
		this.password=password;
		
	}
	
	void login() {
		System.out.println(username+" ---- "+password);
	}
	
	public static void main(String[] args) {
		MethodsDemo9 obj=new MethodsDemo9();
		obj.credentials("TestUser", "Test$321");
		
		System.out.println("Instance variable values: "+obj.username+" --- "+obj.password);
		
		obj.login();
		
	}

}
