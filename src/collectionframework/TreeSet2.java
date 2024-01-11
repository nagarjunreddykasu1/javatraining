package collectionframework;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {

		TreeSet<String> ts=new TreeSet<>();
		ts.add("India");
		ts.add("China");
		ts.add("Pakistan");
		ts.add("Australia");
		ts.add("United States");

		System.out.println(ts);

		System.out.println(ts.higher("Pakistan"));
		System.out.println(ts.lower("Pakistan"));

		System.out.println("Headset: "+ts.headSet("Pakistan"));
		System.out.println("Tailset: "+ts.tailSet("Pakistan"));

		System.out.println("Subeset: "+ts.subSet("China", "United States"));

		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());

		System.out.println(ts);


	}

}
