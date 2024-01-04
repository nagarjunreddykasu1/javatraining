package strings;

public class StringComparison {
	
	
	public static void main(String[] args) {
		
		
		String actualMessage="Please enter valid Email_Id";
		
		String expectedMessage="Please enter valid Email_Id";
		
		System.out.println(actualMessage.equals(expectedMessage));
		
		System.out.println(actualMessage.equalsIgnoreCase(expectedMessage));
		
		System.out.println(actualMessage.contentEquals(expectedMessage));
		
		System.out.println(actualMessage==expectedMessage);//true
		
		String str3=new String("Java");
		String str4=new String("Java");
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		
		StringBuffer sb1=new StringBuffer("Python");
		StringBuffer sb2=new StringBuffer("Python");
		
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false
		
		StringBuffer sb3=sb1;
		
		System.out.println(sb1==sb3);//true
		System.out.println(sb1.equals(sb3));//true
		
		//to convert string which is number to int type
		String size="10";
		
		int in=Integer.parseInt(size);
		System.out.println(in+20);
		
		//to convert int to string type
		int count=100;
		
		String countValue=String.valueOf(count);
		System.out.println(countValue+200);
		
			
		
		
		
		
	}

}

