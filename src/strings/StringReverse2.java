package strings;

public class StringReverse2 {

	public static void main(String[] args) {
		//Approach-1 to reverse a string
		String company="XTGLOBAL";
		char ch;
		String reverse="";
		for(int i=company.length()-1;i>=0;i--){
			ch=company.charAt(i);
			reverse=reverse+ch;

		}

		System.out.println(reverse);

		//Approach-2 to reverse a string
		String str="SELENIUM";
		char c;
		String rev="";
		for(int i=0;i<str.length();i++){
			c=str.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
	}

}
