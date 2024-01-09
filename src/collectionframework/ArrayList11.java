package collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList11 {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("India");
		al.add("Pakistan");
		al.add("China");
		al.add("United States");//USA
		al.add("Australia");
		
		ListIterator<String> lstr=al.listIterator();
		lstr.add("Russia");
		while(lstr.hasNext()) {
			String name=lstr.next();
			//System.out.println(name);
			if(name.equals("China")) {
				lstr.remove();
			}
			
			if(name.equals("United States")) {
				lstr.set("USA");
			}
	
		}
		
		System.out.println(al);
		
		
	}

}
