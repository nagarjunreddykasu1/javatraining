package basics;

public class MethodsDemo7 {
	//instance variables
	int a=5,b=10;
	
	
	//instance method
	void add(int p, int q) {
		System.out.println(p+q);//300
		System.out.println(a+b);//15
	}
	
	public static void main(String[] args) {
		MethodsDemo7 obj=new MethodsDemo7();
		obj.add(100, 200);
		
		
	}

}
