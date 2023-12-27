package basics;

public class MethodsDemo10 {
	
	
	
	//instance method
	int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
	boolean isVisible() {
		System.out.println("isVisible method");
		return true;
	}
	
	String email() {
		System.out.println("email method");
		return "test@gmail.com";
		//System.out.println("");
	}
	
	public static void main(String[] args) {
		MethodsDemo10 obj=new MethodsDemo10();
		
		int result=obj.add(10, 20);
		System.out.println(result);
		
		boolean result2=obj.isVisible();
		System.out.println(result2);
		
		String email=obj.email();
		System.out.println(email);
	}

}

/*

Inside the method, we can declare only one return statement and that return statement should be the last statement, otherwise you will get compile time exception
'Unreachable code'.
*/
