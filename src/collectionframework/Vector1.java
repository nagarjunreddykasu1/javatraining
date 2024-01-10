package collectionframework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {
	
	public static void main(String[] args) {
		
		Vector<String> vc=new Vector<>();
		vc.add("India");
		vc.add("Pakistan");
		vc.add("China");
		vc.add("United States");
		vc.add("Australia");
		
		System.out.println("--- Using for loop ---");
		for(int i=0;i<vc.size();i++) {
			System.out.println(vc.get(i));
		}
		
		System.out.println("--- Using for each loop ---");
		for(String name:vc) {
			System.out.println(name);
		}
		
		System.out.println("--- Using Enumeration ---");
		Enumeration<String> en=vc.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		System.out.println("--- Using Iterator ---");
		Iterator<String> itr=vc.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--- Using ListIterator ---");
		ListIterator<String> lstr= vc.listIterator();
		while(lstr.hasNext()) {
			System.out.println(lstr.next());
		}
		
		
		
	}

}

/*
Vector:
It is implemented in java 1.0. legacy class
Heterogeneous objects are allowed.
NULL insertion is possible
duplicate objects are allowed.
insertion order is preserved.
data structure is resizable array and growable array.
we can retrieve the objects from Vector: for, for each, Enumeration, Iterator, ListIterator

*/