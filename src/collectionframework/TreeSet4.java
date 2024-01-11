package collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet4 {
	
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("India");
		ts.add("China");
		ts.add("Pakistan");
		ts.add("Australia");
		ts.add("United States");
		
		
		TreeSet<String> ts2=new TreeSet<>(ts);
		
		System.out.println(ts2);
		
		
		Iterator<String> itr=ts.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
