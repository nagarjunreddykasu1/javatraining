package constructors;

public class ConstructorsDemo2 {
	
	
	/*
	 * ConstructorsDemo2(){ System.out.println("user defined 0-arg constructor"); }
	 */
	
	ConstructorsDemo2(int count){
		System.out.println("user defined 1-arg constructor");
	}
	
	
	
	public static void main(String[] args) {
		//ConstructorsDemo2 obj=new ConstructorsDemo2();
		
		ConstructorsDemo2 obj2=new ConstructorsDemo2(1000);
		
	
	}

}
