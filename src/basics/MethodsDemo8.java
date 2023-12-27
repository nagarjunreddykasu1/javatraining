package basics;

public class MethodsDemo8 {

	//instance variables
	int a=5,b=10;

	//instance method
	void add(int a, int b) {
		System.out.println(a+b);//300
		System.out.println(this.a+this.b);//15
	}

	public static void main(String[] args) {
		MethodsDemo8 obj=new MethodsDemo8();
		obj.add(100,200);
	}

}
/*
'this' keyword is applicable only in instance area.

*/