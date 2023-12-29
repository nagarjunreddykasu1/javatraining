package inheritance;

public class ChildVariables extends ParentVariables{
	//instance variables
	String username="instanceuser", password="password";
	
	void click() {
		System.out.println("click method from child class");
	}
	
	ChildVariables(){
		super();
		System.out.println("child class constructor");
		
		
	}
	void login(String username, String password) { //local variables
		System.out.println(username+" --- "+password);//local
		System.out.println(this.username+" --- "+this.password); //instance
		System.out.println(super.username+" --- "+super.password); //parent class instance
		
		click();//current class instance method
		super.click();//calling parent class click method
		
	}
	
	public static void main(String[] args) {
		ChildVariables child=new ChildVariables();
		
		child.login("localuser", "localpassword");
		
		
		AccessModifiers obj=new AccessModifiers();
		System.out.println(obj.password);
		
		obj.employeeInfo();
		
	}

}
