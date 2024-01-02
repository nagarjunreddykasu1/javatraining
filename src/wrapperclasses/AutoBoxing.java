package wrapperclasses;

public class AutoBoxing {
	
	int a; //0
	
	Integer in;//null
	
	String name;//null
	
	public static void main(String[] args) {
		
		byte b=10;
		
		Byte byteObj=b;//Byte.valueOf(b); //auto boxing
		
		//Byte byteObj2=Byte.valueOf(b);
		
		
		System.out.println("primitive byte value: "+b);
		System.out.println("wrapper object value: "+byteObj);
		
		double d=10.75;
		Double dObj=d;//Double.valueOf(d);
		
		System.out.println("primitive double: "+d);
		System.out.println("wrapper double: "+dObj);
		
		char c='K';
		Character cObj=c;
		
		boolean bool=true;
		Boolean blObj=bool;
		
		
		
		
		
		
		
	}

}
