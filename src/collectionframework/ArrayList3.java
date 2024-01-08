package collectionframework;

import java.util.ArrayList;

public class ArrayList3 {
	
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		//add()
		
		al1.add("India");
		al1.add("Pakistan");
		al1.add("China");
		al1.add("United States");
		al1.add("India");
		
		System.out.println(al1.remove(0));//India
		
		System.out.println(al1);//
		
		System.out.println(al1.remove("China"));//true
		
		System.out.println(al1);
		
		
		
	}

}
