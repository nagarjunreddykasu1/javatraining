package collectionframework;

import java.util.ArrayList;

public class ArrayList8 {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("India");
		al.add("Pakistan");
		al.add("China");
		al.add("United States");
		al.add("Australia");
		al.add("India");
		
		ArrayList<String> dist=new ArrayList<>();
		
		ArrayList<String> dup=new ArrayList<>();
		
		for(String str:al) {
			if(!dist.contains(str)) {
				dist.add(str);
			}
			else {
				dup.add(str);
			}
		}
		
		System.out.println("Distinct objects: "+dist);
		System.out.println("Duplicate objects: "+dup);
		
		
		
		ArrayList<String> al1=new ArrayList<>();
		al1.add("India");
		al1.add("Pakistan");
		al1.add("China");
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("India");
		al2.add("Australia");
		al2.add("United States");
		
		/*
		 * al1.retainAll(al2);
		 * al2.retainAll(al1);
		 * ArrayList<String> common=new ArrayList<>(); 
		 * common.addAll(al1); 
		 * common.addAll(al2);
		 * System.out.println("common objects: "+common);
		 */
		
		
		for(int i=0;i<al1.size();i++) {
			if(al1.contains(al2.get(i))) {
				al1.remove(i);
				al2.remove(i);
			}
		}
		
		ArrayList<String> unmatched=new ArrayList<>();
		unmatched.addAll(al1);
		unmatched.addAll(al2);
		System.out.println("Unmatched objects: "+unmatched);
		
		
	}

}
