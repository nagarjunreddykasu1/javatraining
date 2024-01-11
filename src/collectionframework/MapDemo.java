package collectionframework;

import java.util.HashMap;

public class MapDemo {
	
	
	public static void main(String[] args) {
		
		HashMap<String,String> hm=new HashMap<>();
		
		hm.put("username", "nagarjun.sdet@gmail.com");//Entry
		hm.put("password", "Test@123");
		
		//System.out.println(hm);
		
		System.out.println(hm.put("username", "Nag"));
		
		System.out.println(hm);
		
		hm.putIfAbsent("login", "Login button");
		
		System.out.println(hm.putIfAbsent("password", "Abc$555"));
		
		System.out.println(hm);
		
		
		
		
		
	}

}



/*

Map:
====


										Map(i)
					
HashMap(c)				ConcurrentHashMap(c)		SortedMap(i)					Hashtable(c)


LinkedHashMap(c)									NavigableMap(i)					Properties(c)

													TreeMap(c)



Each key and value pair combination is called Entry.

Duplicate keys are NOT allowed.

HashMap:

HashMap does not allow duplicate keys but values can be duplicated.

HashMap allows only null key and multiple null values.

Insertion order is NOT preserved.

Datastructure is Hashtable.

HashMap is NOT synchronized. it is not thread safe.






*/