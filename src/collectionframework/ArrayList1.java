package collectionframework;

import java.util.ArrayList;

public class ArrayList1 {
	
	
	public static void main(String[] args) {
		
		/*
		 * ArrayList al=new ArrayList(); al.add(10); al.add(10.75); al.add(true);
		 * al.add('K'); al.add("XTGlobal"); System.out.println(al);
		 */
		
		
		ArrayList<String> al=new ArrayList<>();
		//add()
		
		al.add("India");
		al.add("Pakistan");
		al.add("China");
		al.add("United States");
		
		al.add(0, "Australia");
		al.add("India");
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		
		
		
		
		
	}
	

}
