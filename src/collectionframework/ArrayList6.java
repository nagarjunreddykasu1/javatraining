package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList6 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al1=new ArrayList<>();
		//add()
		
		al1.add("India");
		al1.add("Pakistan");
		al1.add("China");
		al1.add("United States");
		al1.add("Australia");
		
		
		List<String> l=al1.subList(1, 4);
		System.out.println(l);
		
		
		ArrayList<String> list=new ArrayList<>(al1.subList(1, 4));
		System.out.println(list);
		
		
		
		
		
		
		
	}

}
