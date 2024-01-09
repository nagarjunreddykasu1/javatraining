package collectionframework;

import java.util.ArrayList;

public class ArrayList14 {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("India");
		al.add("Pakistan");
		al.add("China");
		al.add("United States");
		al.add("Australia");
		
		
		String[] arr=new String[al.size()];
		al.toArray(arr);
		
		System.out.println("--- Using for loop ---");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(" --- Using for each loop ---");
		for(String name:arr) {
			System.out.println(name);
		}
	}

}
