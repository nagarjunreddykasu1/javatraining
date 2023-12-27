package basics;

public class MethodsDemo5 {
	
	void method1(byte b) {
		System.out.println("byte value: "+b);
	}
	
	void method2(short s) {
		System.out.println("short value: "+s);
	}
	
	void method3(float f) {
		System.out.println("float value: "+f);
	}
	
	void method4(int a) {
		System.out.println("int value: "+a);
	}
	
	public static void main(String[] args) {
		MethodsDemo5 obj=new MethodsDemo5();
		
		obj.method1((byte)100); //int 
		
		obj.method2((short)125);
		
		obj.method3(15.75f);
		
		obj.method4(200);
		
		
		
		
		
	}

}
