package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListComparision {
	
	public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(1,3,4,5,6,7,9);
		
		List<Integer> list2=Arrays.asList(1,3,4,5,6,7,8);
		
		List<Integer> unmatched1=list1.stream().filter(x->!list2.contains(x)).collect(Collectors.toList());
		
		List<Integer> unmatched2=list2.stream().filter(x->!list1.contains(x)).collect(Collectors.toList());
		
		List<Integer> unmatched=new ArrayList<>(unmatched1);
		unmatched.addAll(unmatched2);
		
		System.out.println("unmatched elements: "+unmatched);
		
		
		
		
	}
	

}
