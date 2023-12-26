package basics;

public class InstanceVariables2 {
	
	//instance variable
	int a=10;
	
	//instance method
	void display() {
		System.out.println("display method");
		System.out.println("value of a: "+a);
		//instance area
	}
	
	
	public static void main(String[] args) {
		//static area
		InstanceVariables2 obj=new InstanceVariables2();
		obj.display();
		
		System.out.println(obj.a);
		
	}

}
