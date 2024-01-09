package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList15 {
	
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		al1.add("India");
		al1.add("Pakistan");
		al1.add("China");
		al1.add("United States");
		al1.add("Australia");
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("India");
		al2.add("Pakistan");
		al2.add("China");
		al2.add("United States");
		al2.add("Russia");
		
		Iterator<String> itr=al1.iterator();
		
		while(itr.hasNext()) {
			String name=itr.next();
			if(al2.remove(name)) {
				itr.remove();
			}
		}
		
		ArrayList<String> unmatched=new ArrayList<>(al1);
		//unmatched.addAll(al1);
		unmatched.addAll(al2);
		
		System.out.println("Unmatched objects: "+unmatched);
		
	}

}
