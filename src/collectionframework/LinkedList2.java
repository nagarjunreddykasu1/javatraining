package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("India");
		al.add("Pakistan");
		al.add("China");
		al.add("United States");
		al.add("Australia");
		
		
		LinkedList<String> ll=new LinkedList<>(al);
		//ll.addAll(al);
		ll.add("Russia");
		
		System.out.println(ll);
		
		
		ll.addFirst("aa");
		ll.addLast("lll");
		ll.removeFirst();
		ll.removeLast();
		ll.removeLastOccurrence("");
		
		
	}

}
