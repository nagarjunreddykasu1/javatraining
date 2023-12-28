package basics;

public class MethodsDemo15 {
	
	//static method
	static Dashboard login(Dashboard d) {
		System.out.println("login method");
		System.out.println(d.count);
		d.dashboard();
		return d;
	}
	
	public static void main(String[] args) {
		
		Dashboard dbOjb=new Dashboard();
		Dashboard dbObject=MethodsDemo15.login(dbOjb);
	}

}
