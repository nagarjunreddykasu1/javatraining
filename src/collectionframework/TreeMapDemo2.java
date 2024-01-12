package collectionframework;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo2 {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(2, "Java");
		tm.put(1, "Selenium");
		tm.put(4, "Appium");
		tm.put(3, "Rest Assured");
		
		
		Set<Entry<Integer, String>> entries=tm.entrySet();
		Iterator<Entry<Integer, String>> itr=entries.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> entry=itr.next();
			System.out.println(entry.getKey()+" --- "+entry.getValue());
		}
		
		
		TreeMap<Integer,String> tm2=new TreeMap<>(tm);
		System.out.println(tm2);
		
		//containsKey(key)  containsValue(value)
		
		
		SortedMap<Integer, String> head=tm.headMap(3);
		System.out.println("headmap: "+head);
		
		System.out.println("tailmap: "+tm.tailMap(3));
	}

}
