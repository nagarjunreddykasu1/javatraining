package collectionframework;

import java.util.Hashtable;

public class Hashtable1 {
	
	
	public static void main(String[] args) {
		
		
		Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(1, "Selenium");
		ht.put(2, "Java");
		ht.put(3, "Rest Assured");
		//ht.put(null, "");
		//ht.put(4, null);
		//ht.put(null, null);
		
		ht.put(3, "Appium");
		
		System.out.println(ht);
		
		
		System.out.println(ht.remove(3));
		
		System.out.println(ht);
		
		
		System.out.println(ht.get(2));
		
		System.out.println(ht.getOrDefault(5, "Key Not Found"));
	}

}


/*
Hashtable:
It doesnot accept null key and null value.
Duplicate keys are not allowed.
Data structure is Hashtable
Insertion order is not preserved.




*/