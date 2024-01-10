package collectionframework;

import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		
		Vector<String> vc=new Vector<>();
		vc.add("India");
		vc.add("Pakistan");
		vc.add("China");
		vc.add("United States");
		vc.add("Australia");
		
		Vector<String> vc2=new Vector<>(vc);
		//vc2.addAll(vc);
		
		System.out.println(vc2);
		
	}

}
