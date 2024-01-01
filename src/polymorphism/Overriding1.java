package polymorphism;

public class Overriding1 extends Overridden1{
	
	int count=100;
	
	//overriding method
	protected void config() {
		System.out.println("config method in child class");
	}
	
	
	void display() {
		super.config();//calling parent class config method
		System.out.println(super.count);
		config();
		
	}
	
	/*
	 * private void base() {
	 * 
	 * }
	 */
	
	/*
	 * Overridden1(){
	 * 
	 * }
	 */
	
	
	public static void main(String[] args) {
		Overriding1 obj=new Overriding1();
		obj.display();
	}

}



/*
Overriding:
===========
Rules:
1. Overridden method signature and overriding method signature should be same.
2. The return type of overridden method and overriding method must be same at primitive level.
3. The access level can not be more restrictive than overridden method's access level.
private < default < protected < public

4. A method declared as private can not be overridden.

5. A method declared as final can not be overridden.

6. A method declared as static can not be overridden.

7. Constructors can not be overridden.

Parent				Child
=======				======
public 				public
default				default, protected, public
protected			protected, public














*/