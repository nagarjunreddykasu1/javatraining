package basics;

public class MethodsDemo13 {
	
	
	void login(Dashboard db) {
		System.out.println("login method");
		
		System.out.println(db.count);
		db.dashboard();

	}
	
	public static void main(String[] args) {
		/*
		 * MethodsDemo13 obj=new MethodsDemo13(); 
		 * Dashboard ob=new Dashboard();
		 * obj.login(ob);
		 */
		
		
		new MethodsDemo13().login(new Dashboard());
		
		
	}

}
