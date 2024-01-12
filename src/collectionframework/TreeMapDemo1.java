package collectionframework;

import java.util.TreeMap;

public class TreeMapDemo1 {
	
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(2, "Java");
		tm.put(1, "Selenium");
		tm.put(4, "Appium");
		tm.put(3, "Rest Assured");
		//tm.put(null, "JMeter");
		
		System.out.println(tm);
		
		System.out.println(tm.lowerKey(2));
		System.out.println(tm.higherKey(2));
		
		System.out.println(tm.firstKey());
		System.out.println(tm.firstEntry());
		
		System.out.println(tm.lastKey());
		System.out.println(tm.lastEntry());
		
		System.out.println(tm.pollFirstEntry());
		
		System.out.println(tm.pollLastEntry());
		
		System.out.println(tm);
		
	}
	

}


/*

TreeMap:

Insertion order is not preserved but it sorts the entries in ascending order based on key.

null key is not allowed.


*/