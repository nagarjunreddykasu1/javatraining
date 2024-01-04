package strings;

public class StringDemo {
	
	
	public static void main(String[] args) {
		
		String course="Selenium";
		
		System.out.println(course);
		
		
		String name="Java";
		
		System.out.println(course+name);//SeleniumJava
		
		//concat
		
		String combinedString=course.concat("WebDriver");
		
		System.out.println(course);// Selenium
		
		System.out.println(combinedString);//SeleniumWebDriver
		
		//length: returns total numbers of characters in the string
		
		System.out.println(course.length());
		
		//charAt(index) : it returns the character at the specified index
		
		char ch=course.charAt(1);
		System.out.println(ch);
		
		
		//indexOf(): it returns the index number of first occurance of specified character.
		
		int in=course.indexOf('e');
		System.out.println(in);
		
		System.out.println(course.indexOf('p'));
		
		
		System.out.println(course.indexOf("ele"));
		
		System.out.println(course.indexOf('e', 2));
		
		System.out.println(course.indexOf("ele", 3));
		
		//trim(): it is used to remove the leading and trailing whitespaces.
		
		String company="     XTGLOBAL INFOTECH      ";
		
		System.out.println(company);
		
		System.out.println(company.trim());
		
		
		System.out.println(course.replace('e', 'E'));//SElEnium
		
		System.out.println(course.replaceAll("[e]", "1"));//S1l1nium
		
		
		//split(): it devides the string based on regular expression and returns an array of strings
		
		String months="Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec";
		
		String[] arr=months.split(",");
		
		for(String m:arr) {
			System.out.println(m);
		}
		
		String message="There are only 10 products available";
		
		String[] msg=message.split(" ");
		
		System.out.println(msg[3]+30);//1030  string+number=string
		
		System.out.println(Integer.parseInt(msg[3])+30);//40 int+int=int
		
		
	}

}


/*
String:

String is a class and it is object type.

String is immutable.

String str="selenium"

String name=new String("java");




*/
