package basics;

public class StaticVariables {
	
	//static variable
	static int a=10;
	
	//instance variable
	int b=111;
	
	
	//instance method
	void display() {
		//instance area
		double sal=25000;//local variable
		System.out.println(StaticVariables.a);
		System.out.println("values of b: "+b);
	}
	
	//static method
	static void info() {
		//static area
		StaticVariables obj=new StaticVariables();
		System.out.println(obj.b);
	}
	
	public static void main(String[] args) {
		
		System.out.println(StaticVariables.a);//recommended approach
		
		StaticVariables obj=new StaticVariables();
		System.out.println(obj.a);
		
		System.out.println(a);
		
		obj.display();
		
		StaticVariables.info();

		
	}

}

/*
static variables:
==================
The variables declared inside the class but outside of method or constructor or block with static keyword are called as static variables.

Access modifiers can be given to static variables

static variables have defualt values.

static variables are visible for all the methods.



Accessing static members:
===========================
					static variables/methods
				
				 access by using classname
		
		instance_area						static_area



*/