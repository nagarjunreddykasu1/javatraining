package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
	
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("India");
		hs.add("China");
		hs.add("Pakistan");
		hs.add("China");
		hs.add("United States");
		hs.add("Australia");
		
		System.out.println("--- for each loop ---");
		for(String name:hs) {
			System.out.println(name);
		}
		
		System.out.println("--- Using Iterator ---");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//hs.remove("China");
		
		hs.clear();
		
		System.out.println(hs);//[]
		
		
		
	}

}
