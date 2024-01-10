package collectionframework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> hs=new LinkedHashSet<>();
		hs.add("India");
		hs.add("China");
		hs.add("Pakistan");
		hs.add("China");
		hs.add("United States");
		hs.add("Australia");
		hs.add(null);
		hs.add(null);
		
		System.out.println("-- Using for loop ---");
		for(String name:hs) {
			System.out.println(name);
		}
		
		System.out.println("--Using Iterator ---");
		Iterator<String> itr=hs.iterator(); //Ctrl+Shift+O
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		LinkedHashSet<String> hs2=new LinkedHashSet<>(hs);
		//hs2.addAll(hs);
		
		
		
		
	}

}

/*
LinkedHashSet:

Heterogeneous objects are allowed.
Duplicate objects are not allowed.
null insertion is possible. only one null object is allowed.
Datastructure is LinkedList and HashTable.
Insertion order is preserved.
We can retrieve the objects: for each and Iterator

*/