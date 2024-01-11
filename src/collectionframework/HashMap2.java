package collectionframework;

import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();

		hm.put("username", "nagarjun.sdet@gmail.com");//Entry
		hm.put("password", "Test@123");
		
		hm.put("password", "Test3423");
		
		hm.put("password", "Test3423");
		hm.put("password", "asdfg");
		
		
		//get
		System.out.println(hm.get("username"));
		
		System.out.println(hm.getOrDefault("password1", "not found"));
		
		
		//remove
		
		System.out.println(hm.remove("password11"));
		
		System.out.println(hm);
		
		hm.remove("username","Test@123");
		
		
		System.out.println(hm.replace("password", "XTG$100"));
		
		System.out.println(hm);
		
		//containsKey()  containsValue()
		
		System.out.println(hm.containsKey("password"));
		System.out.println(hm.containsKey("passwordTest"));
		
		System.out.println(hm.containsValue("Test@123"));//
		System.out.println(hm.containsValue("XTG$100"));//
		
		
		System.out.println(hm.size());
		
		
		
		
		
		
		



	}

}
