package basics;

public class MethodsDemo2 {
	
	//instance method
	void employeeInfo(int empId, String employeeName) { //local variables
		System.out.println(empId +" ---- "+employeeName);
	}
	
	static void sendKeys(String element, String value) {
		System.out.println(element+" ---- "+value);
	}

	public static void main(String[] args) {
		
		MethodsDemo2 obj=new MethodsDemo2();
		obj.employeeInfo(100,"NagarjunReddy");
		
		MethodsDemo2.sendKeys("UserName", "TestUser");
		
		
		
		
	}

}
