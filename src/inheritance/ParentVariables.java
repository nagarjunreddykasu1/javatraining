package inheritance;

public class ParentVariables {
	
	//instance variables
	String username="parentuser", password="parentpassword";
	
	 void click() {
		//int age=25;
		System.out.println("click method from parent class");
	}
	
	ParentVariables(){
		System.out.println("parent class constructor");
	}

}
