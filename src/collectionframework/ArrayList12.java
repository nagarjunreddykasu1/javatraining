package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList12 {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("India");
		al.add("Pakistan");
		al.add("China");
		al.add("United States");
		al.add("Australia");
		
		System.out.println("--- Before sorting ---");
		for(String name:al) {
			System.out.println(name);
		}
		
		System.out.println("--- After sorting in ascending order ---");
		Collections.sort(al);
		for(String name:al) {
			System.out.println(name);
		}
		
		System.out.println("--- After sorting in descending order ---");
		//approach-1
		/*
		 * Collections.sort(al, Collections.reverseOrder()); for(String name:al) {
		 * System.out.println(name); }
		 */
		
		//approach-2
		
		Collections.reverse(al);
		for(String name:al) {
			System.out.println(name);
		}
	}

}
