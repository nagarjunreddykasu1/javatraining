package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList10 {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("India");
		al.add("Pakistan");
		al.add("China");
		al.add("United States");
		al.add("Australia");
		
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()) {
			String name=itr.next();
			//System.out.println(name);
			if(name.equals("China")) {
				itr.remove();
			}
		}
		
		System.out.println(al);
		
		
		
	}

}
