package collectionframework;

import java.util.TreeSet;

public class TreeSet1 {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<>();
		ts.add("India");
		ts.add("China");
		ts.add("Pakistan");
		ts.add("Australia");
		ts.add("United States");
		
		//ts.add(null);
		
		System.out.println(ts);

			
	}

}


/*
TreeSet:
Heterogeneous objects are allowed.
Duplicate objects are not allowed.
null insertion is NOT possible.
Datastructure are LinkedList and HashTable.
Insertion order is not preserved. but all objects will be sorted in ascending order.
We can retrieve the objects: for each and Iterator.


*/