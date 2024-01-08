package collectionframework;

import java.util.ArrayList;

public class ArrayList2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al1=new ArrayList<>();
		//add()
		
		al1.add("India");
		al1.add("Pakistan");
		al1.add("China");
		al1.add("United States");
		
		al1.add(0, "Australia");
		al1.add("India");
		
		
		ArrayList<String> al2=new ArrayList<>(al1);
		//al2.add("Russia");
		//al2.addAll(0,al1);
		
		//al2.addAll
		
		System.out.println(al2);
		
		//isEmpty()
		
		System.out.println(al1.isEmpty());//false
		
		al1.clear();
		
		System.out.println(al1.isEmpty());//true
		
		System.out.println(al1);
		
		
		
		
		
	}

}
