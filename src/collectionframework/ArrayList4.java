package collectionframework;

import java.util.ArrayList;

public class ArrayList4 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al1=new ArrayList<>();
		//add()
		
		al1.add("India");
		al1.add("Pakistan");
		al1.add("India");
		al1.add("China");
		al1.add("India");
		al1.add("United States");
		
		
		
		//al1.set(0, "INDIA");
		
		System.out.println(al1);
		
		
		System.out.println(al1.indexOf("China"));
		
		System.out.println(al1.indexOf("India"));
		System.out.println(al1.lastIndexOf("India"));
		
		
		System.out.println(al1.size());
		
		System.out.println(al1.get(2));//
		
		System.out.println(al1.contains("China"));
		
		
	}

}
