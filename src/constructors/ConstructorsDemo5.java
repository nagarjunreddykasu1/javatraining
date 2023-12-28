package constructors;

public class ConstructorsDemo5 {
	
	ConstructorsDemo5(double amount){
		System.out.println("double value: "+amount);
	}
	
	ConstructorsDemo5(int amount){
		System.out.println("int value: "+amount);
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorsDemo5 obj=new ConstructorsDemo5('K');
		
	}

}
