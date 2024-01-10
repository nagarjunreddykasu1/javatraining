package collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList17 {
	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList<>();
		al.add("India");
		al.add("Pakistan");
		al.add("China");
		al.add("United States");
		al.add("Australia");
		
		System.out.println("--- Objects in forward direction ---");
		ListIterator<String> lstr=al.listIterator();
		while(lstr.hasNext()) {
			String name=lstr.next();
			System.out.println(name);
		}
		System.out.println("--- Objects in backward direction ---");
		while(lstr.hasPrevious()) {
			String name=lstr.previous();
			System.out.println(name);
		}
		
		
	}

}
