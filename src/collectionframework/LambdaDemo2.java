package collectionframework;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaDemo2 {
	
	public static void main(String[] args) {
		
		
		 List<String> list=Arrays.asList("Capgemini","XTGlobal","TCS","Infosys","ValueLabs");
		 
		 Collections.sort(list, (c1,c2)->c1.compareTo(c2));
		System.out.println(list);
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		//numbers.forEach(num -> System.out.println(num));
		
		numbers.forEach(num -> System.out.println(num*num));
		
		
		Map<Integer,String> hm=new HashMap<>();
		hm.put(2, "India");
		hm.put(1, "China");
		hm.put(3, "Pakistan");
		
		hm.forEach((key,value)-> System.out.println("key: "+key+" -- value: "+value));
		
		
		
	}

}
