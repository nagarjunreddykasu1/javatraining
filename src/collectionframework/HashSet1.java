package collectionframework;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSet1 {
	
	
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("India");
		hs.add("China");
		hs.add("Pakistan");
		hs.add("China");
		hs.add("United States");
		hs.add("Australia");
		
		
		System.out.println(hs);
		
		System.out.println(hs.remove("Pakistan"));
		
		LinkedList<String> al=new LinkedList<>();
		al.add("India");
		al.add("Pakistan");
		al.add("China");
		al.add("United States");
		al.add("Australia");
		al.add("China");
		al.add("China");
		
		
		HashSet<String> hs2=new HashSet<>(al);
		System.out.println(hs2);
		
		//hs2.addAll(al);
		
		
		
	}

}



/*
HashSet:

Heterogeneous objects are allowed.
Duplicate objects are not allowed.
null insertion is possible. only one null object is allowed.
Datastructure is HashTable.
Insertion order is not preserved.
We can retrieve the objects: for each and Iterator




*/