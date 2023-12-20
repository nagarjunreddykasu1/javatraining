package basics;

public class Operators {
	public static void main(String[] args) {
		int a=15, b=5;
		
		System.out.println(a+b);//20
		System.out.println(a-b);//10
		System.out.println(a*b);//75
		System.out.println(a/b);//3
		System.out.println(a%b);//0
		
		
		/*a+=b;//a=a+b
		System.out.println(a);//20
		a-=b;//a=a-b
		System.out.println(a);//15
		
		a*=b; //a=a*b;
		
		a/=b; //a=a/b
		
		a%=b; //a=a%b
*/		
		System.out.println(a==b);//false
		System.out.println(a<b); //false
		System.out.println(a>b); //true
		System.out.println(a<=b);//false
		System.out.println(a>=b);//true
		System.out.println(a!=b);//true
		
		
		System.out.println(a==b && a>=b);//false
		System.out.println(a>b && a>=b);//true
		
		System.out.println(a==b || a>=b);//true
		System.out.println(a==b || a<=b); //false
		
		System.out.println(!(a>b));//  !true == false
		
		System.out.println(++a);//16
		System.out.println(a++);//16
		System.out.println(a);//17
		
		System.out.println(--a);//16
		System.out.println(a--);//16
		System.out.println(a);//15
	}

}

/*
Operators:
----------
Arithmetic operators:
+ - *  /  %

Assignment operators
=  +=  -= *=  /=   %=

Relational operators
== 	<	>	<=	>=	!=

Logical operators
&&	||	!

Unary operators
++ --

++ --> pre increment post increment
-- --> pre decrement and post decrement

*/