package collectionframework;

import java.util.HashMap;

public class HashMap4 {
	
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();

		hm.put("username", "nagarjun.sdet@gmail.com");//Entry
		hm.put("password", "Test@123");
		
		
		HashMap<String,String> hm2=new HashMap<>();
		hm2.putAll(hm);
		
		System.out.println(hm2);
		
		
	}

}
