package collectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap3 {
	
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();

		hm.put("username", "nagarjun.sdet@gmail.com");//Entry
		hm.put("password", "Test@123");
		
		
		Set<String> keys=hm.keySet();
		
		System.out.println("--- Keys using for each loop ---");
		for(String key:keys) {
			System.out.println(key);
		}
		
		System.out.println("--- Keys using Iterator ---");
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		//To retrieve the values from the map, values()
		
		Collection<String> values=hm.values();
		System.out.println("--- values using for each loop ---");
		for(String value:values) {
			System.out.println(value);
		}
		System.out.println("--- values using Iterator ---");
		Iterator<String> itr1=values.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		//To retrieve the entries, entrySet()
		Set<Entry<String, String>> entries=hm.entrySet();
		System.out.println("--- Entries using for each loop ---");
		for(Entry<String, String> ent:entries) {
			System.out.println(ent);
		}
		
		Iterator<Entry<String, String>> entryItr=entries.iterator();
		System.out.println("--- Entries using Iterator ---");
		while(entryItr.hasNext()) {
			//System.out.println(entryItr.next());
			Entry<String, String> e=entryItr.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		
		
		
		
	}

}
