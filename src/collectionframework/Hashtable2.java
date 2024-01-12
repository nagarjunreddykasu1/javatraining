package collectionframework;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Hashtable2 {
	
	
	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(1, "Selenium");
		ht.put(2, "Java");
		ht.put(3, "Rest Assured");
		
		//To retrieve all the keys
		Set<Integer> keys=ht.keySet();
		System.out.println(keys);
		
		//using Enumeration
		Enumeration<Integer> enKeys=ht.keys();
		//System.out.println(enKeys);
		
		while(enKeys.hasMoreElements()) {
			int key=enKeys.nextElement();
			System.out.println(key);
		}
		
		
		System.out.println("--- Retrieve values ---");
		Collection<String> values=ht.values();
		System.out.println(values);
		
		Enumeration<String> val=ht.elements();
		while(val.hasMoreElements()) {
			String value=val.nextElement();
			System.out.println(value);
		}
		
		System.out.println("--- Retrieve entries ---");
		Set<Entry<Integer, String>> entries=ht.entrySet();
		
		Iterator<Entry<Integer, String>> itr=entries.iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> entry=itr.next();
			//System.out.println(entry);
			System.out.println(entry.getKey()+" --- "+entry.getValue());
		}
		
		System.out.println("--- Using for each loop ---");
		for(Entry<Integer, String> entry:entries) {
			System.out.println(entry);
		}
		
		
	}

}
