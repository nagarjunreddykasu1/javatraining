package basics;

import inheritance.AccessModifiers;

public class PublicDemo {
	
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		System.out.println(obj.email);
		
		System.out.println(AccessModifiers.username);
		
		//System.out.println(obj.);
	}

}
