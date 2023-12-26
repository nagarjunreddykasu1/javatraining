package basics;

public class WideningTypeCasting {
	
	public static void main(String[] args) {
		
		byte b=10;
		
		int i=b;
		
		long l=i;
		
		System.out.println("byte value: "+b);
		System.out.println("int value: "+i);
		System.out.println("long value: "+l);
		
		double d=l;
		System.out.println("double value: "+d);
		
		char ch='a';
		
		int in=ch;
		System.out.println("char to int value: "+in);
		
		
	}

}
