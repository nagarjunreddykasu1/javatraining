package basics;

public class MethodsDemo11 {
	
	String username;
	
	
	String login(String username) {
		System.out.println("login method");
		this.username=username;
		
		return this.username;
	}
	
	public static void main(String[] args) {
		MethodsDemo11 obj=new MethodsDemo11();
		String user=obj.login("TestUser");
		System.out.println(user);
		
	}

}
