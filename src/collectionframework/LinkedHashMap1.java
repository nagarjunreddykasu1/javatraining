package collectionframework;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(1, "Selenium");
		lhm.put(2, "Java");
		lhm.put(3, "Rest Assured");
		
		Set<Entry<Integer, String>> set=lhm.entrySet();
		Iterator<Entry<Integer, String>> itr=set.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> entry=itr.next();
			System.out.println(entry);
			
			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
		}
		
		
		
		
		
	}

}


/*
LinkedHashMap:
===============
It is same as HashMap except insertion order.

Insertion order is preserved.
Data structures are Hashtable and LinkedList




*/