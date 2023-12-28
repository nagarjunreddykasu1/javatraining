package basics;

public class MethodsDemo14 {
	
	//instance method
	void getAmount(double amount) {
		System.out.println("double value: "+amount);
	}
	
	void getAmount(float f) {
		System.out.println("float value: "+f);
	}
	
	public static void main(String[] args) {
		MethodsDemo14 obj=new MethodsDemo14();
		obj.getAmount(12.75);//double
		
		obj.getAmount(100);//
		
		obj.getAmount('A');
	}

}

/*

byte -> short -> int -> long -> float -> double

		char -> int -> long -> float -> double





*/