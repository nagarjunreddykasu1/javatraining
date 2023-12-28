package constructors;

public class ConstructorsDemo6 {
	
	
	//constructor calling inside another constructor
	
	ConstructorsDemo6(){
		System.out.println("0-arg constructor");
	}
	
	ConstructorsDemo6(int count){
		//this();
		this("Admin","admin@321");
		System.out.println("1-arg constructor");
	}
	
	ConstructorsDemo6(String username, String password){
		System.out.println("2-arg constructor");
		System.out.println(username+" --- "+password);
	}
	
	
	public static void main(String[] args) {
		
		//ConstructorsDemo6 obj=new ConstructorsDemo6();//0-arg
		
		ConstructorsDemo6 obj2=new ConstructorsDemo6(100);
		
	}

}

/*
Constructor call must be the first statement inside another constructor.

we can call current class constructor using this keyword.


*/