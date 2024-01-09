package collectionframework;

import java.util.ArrayList;

public class ArrayList9 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList<>();
		al.add("India");
		al.add("Pakistan");
		al.add("China");
		al.add("United States");
		al.add("Australia");
		
		System.out.println("--- Using for each loop ---");
		for(String country:al){
			System.out.println(country);
		}
		
		System.out.println("--- Using for loop ---");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
		
	}

}


/*
Retrieving objects from ArrayList:

3 ways

1. for each loop

2. for loop 

3. Cursors
3 types
i. Enumeration (i): java 1.0

hasMoreElements()
hasElement()

It is applicable for only legacy classes like Vector and Stack.
We can only get the objects but we can not perform add, remove, update operations while retrieving the objects from legacy classes.

ii. Iterator (i):
We can perform read and remove operations while retrieving the objects from collection classes.
It is applicable for all collection implemented classes. It is called universal cursor.

It is single directional cursor. we can retrieve the objects in forward direction only.

hasNext()
next()
remove()

By using Iterator, we can perform read and remove operations , we can not perform addition, updation of objects.


iii. ListIterator (i):
It is child interface of Iterator interface.

By using ListIterator, we can perform read, remove, add, update operations while retrieving the objects.
It is applicable for only List implemented classes like ArrayList, CopyOnWriteArrayList, LinkedList, Vector, Stack.

It is bidirectional cursor. we can retrieve the objects in both forward and backward directions.

hasNext()
next()
remove()
add()
set()






*/