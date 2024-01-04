package strings;

public class StringBufferDemo {
	
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Selenium");
		
		
		System.out.println(sb);
		
		
		//append()
		
		sb.append("Java");
		System.out.println(sb);//SeleniumJava
		
		//insert(): inserts the given string at the specified index.
		sb.insert(3,"TEST");
		System.out.println(sb);//SelTESTeniumJava
		
		//replace
		
		sb.replace(3, 7, "NNN");//SelNNNeniumJava
		System.out.println(sb);
		
		
		//delete: deletes the string from the specified beginIndex to EndIndex-1
		sb.delete(3, 6);
		
		System.out.println(sb);//SeleniumJava
		
		//reverse(): reverses the given string
		sb.reverse();
		System.out.println(sb);//avaJmuineleS
		
		
		
		
		
		
		
		
	}

}


/*
StringBuffer:
==============
It is used to create mutable string objects.
It is synchronized and thread-safe..



StringBuilder:
===============
It is used to create mutable string objects.
It is non-synchronized and not thread-safe.






*/
