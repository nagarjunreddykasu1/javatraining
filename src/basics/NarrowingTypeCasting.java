package basics;

public class NarrowingTypeCasting {
	
	public static void main(String[] args) {
		
		double d=10.75;
		
		float fl=(float)d;
		
		System.out.println("double value: "+d);//10.75
		System.out.println("float value: "+fl);//10.75
		
		int i=(int)d;
		System.out.println("int value: "+i);//10
		
		short s=(short)d;
		System.out.println("short value: "+s);//10
		
		char c='A';
		short sh=(short)c;
		System.out.println("short value: "+sh);
	}

}
