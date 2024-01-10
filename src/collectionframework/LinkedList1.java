package collectionframework;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	
	public static void main(String[] args) {
		
		
		LinkedList<String> al=new LinkedList<>();
		al.add("India");
		al.add("Pakistan");
		al.add("China");
		al.add("United States");
		al.add("Australia");
		
		System.out.println("--- Using for loop ---");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
		System.out.println("--- Using for each loop ---");
		for(String name:al) {
			System.out.println(name);
		}
		
		System.out.println("--- Using Iterator ---");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("--- Using ListIterator ---");
		ListIterator<String> lstr=al.listIterator();
		while(lstr.hasNext()) {
			System.out.println(lstr.next());
		}
		
		
	}

}



/*
LinkedList:
Heterogeneous objects are allowed.
NULL insertion is possible
duplicate objects are allowed.
insertion order is preserved.
data structure is double linkedlist.
we can retrieve the objects from LinkedList: for, for each, Iterator, ListIterator




*/
