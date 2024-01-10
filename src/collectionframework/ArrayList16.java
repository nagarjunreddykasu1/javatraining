package collectionframework;

import java.util.ArrayList;

public class ArrayList16 {
	public static void main(String[] args) throws Exception {
		ArrayList<String> al1=new ArrayList<>();
		al1.add("India");
		al1.add("Pakistan");
		al1.add("China");
		al1.add("United States");
		//al1.add("Australia");
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("India");
		al2.add("Pakistan");
		al2.add("China");
		al2.add("United States");
		//al2.add("Russia");
		
		ArrayList<String> unmatched=Reusable.compareArrayLists(al1, al2);
		
		if(unmatched.size()>0) {
			System.out.println("Both ArrayLists are NOT equal. Unmatched Objects: "+unmatched);
			throw new Exception("Both ArrayLists are NOT equal. Unmatched Objects: "+unmatched);
		}
		else {
			System.out.println("Both ArrayLists are equal.");
		}
		
		
		
		
	}

}
