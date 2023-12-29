package inheritance;

public class Child1 extends Parent1{
	
	int a=10;
	
	void display() {
		System.out.println("display method in child class");
	}
	
	void click() {
		System.out.println("click method in child class");
	}
	
	
	public static void main(String[] args) {
		
		Child1 obj=new Child1();
		System.out.println(obj.a);
		System.out.println(obj.count);
		obj.display();
		obj.click();
		obj.login();
		
		
		Parent1 p=new Parent1();
		System.out.println(p.count);
		p.login();
		
		
		Parent1 p1=new Child1();
		System.out.println(p1.count);
		p1.login();
		
		//Child1 c=new Parent1(); //exception
		
		
		
	}

}

/*
1. If we create object for child class and hold that object in child class reference, then we can access all parent and child class instance members.

2. If we create object for parent class and hold that object in parent class reference, then we can access only parent class instance members.

3. If we create object for child class and hold that object in parent class reference, then we can access only parent class instance members.

4. If we create object for parent class and hold that object in child class reference, then compiler throws an exception "Type mismatch: cannot convert from Parent1 to Child1"

*/