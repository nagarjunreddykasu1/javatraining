package collectionframework;

import java.util.ArrayList;

public class ArrayList5 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al1=new ArrayList<>();
		//add()
		
		al1.add("India");
		al1.add("Pakistan");
		al1.add("China");
		al1.add("United States");
		al1.add("Australia");
		
		
		
		ArrayList<String> al2=new ArrayList<>();
		//add()
		
		al2.add("India");
		al2.add("Pakistan");
		al2.add("China");
		al2.add("United States");
		al2.add("Russia");
		
		System.out.println(al1.retainAll(al2));
		System.out.println(al1);
		
	}

}
