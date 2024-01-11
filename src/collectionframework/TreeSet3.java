package collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet3 {
	
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("India");
		ts.add("China");
		ts.add("Pakistan");
		ts.add("Australia");
		ts.add("United States");
		
		System.out.println("--- Using for each loop ---");
		for(String name:ts) {
			System.out.println(name);
		}
		
		System.out.println("--- Using Iterator ---");
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
	}

}
