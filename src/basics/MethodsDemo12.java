package basics;

public class MethodsDemo12 {
	
	Dashboard login() {
		System.out.println("login method");
		Dashboard obj=new Dashboard();
		return obj;
	}
	
	public static void main(String[] args) {
		MethodsDemo12 obj=new MethodsDemo12();
		Dashboard db=obj.login();
		
		System.out.println(db.count);
		db.dashboard();
	}

}
