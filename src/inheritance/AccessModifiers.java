package inheritance;

public class AccessModifiers {
	
	public String email="nagarjun.sdet@gmail.com";
	
	public static String username="testuser";
	
	
	//instance variable
	private int id=111;
	
	//instance
	protected String password="Test$321";
	
	void employeeInfo() {
		System.out.println("employee info method");
	}
	
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		System.out.println(obj.id);
		
		System.out.println(obj.password);
	}

}


/*
Access modifiers:

public:


private

protected:
Protected members can be accessible within the same package and child class of same/different package.

default:



private < default < protected < public

*/