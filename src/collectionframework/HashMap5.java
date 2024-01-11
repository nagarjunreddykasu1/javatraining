package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap5 {
	
	public static void main(String[] args) throws Exception {
		ConcurrentHashMap<String,String> hm1=new ConcurrentHashMap<>();
		hm1.put("username", "nagarjun.sdet@gmail.com");//Entry
		hm1.put("password", "Test@123");
		//hm1.put("search", "search button");
		
		HashMap<String,String> hm2=new HashMap<>();
		hm2.put("username", "nagarjun.sdet@gmail.com");//Entry
		hm2.put("password", "Test@123");
		//hm2.put("login", "login button");
		
		
		
		Set<Entry<String,String>> entries=hm1.entrySet();
		
		Iterator<Entry<String, String>> itr=entries.iterator();
		while(itr.hasNext()) {
			Entry<String, String> entry=itr.next();
			
			if(hm2.remove(entry.getKey(), entry.getValue())) {
				hm1.remove(entry.getKey());
			}
			
		}
		
		System.out.println(hm1);
		System.out.println(hm2);
		
		HashMap<String,String> unmatched=new HashMap<>(hm1);
		unmatched.putAll(hm2);
		
		System.out.println("Unmatched entries: "+unmatched);
		if(unmatched.size()>0) {
			throw new Exception("Both maps are NOT equal. Unmatched entries: "+unmatched);
		}
		else
			System.out.println("Both maps are equal.");
		
	}

}
