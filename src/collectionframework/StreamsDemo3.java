package collectionframework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo3 {
	
	public static void main(String[] args) {
		int[] arr= {2,3,5,4,6,7,8};
		
		//List<int[]> in=Arrays.asList(arr);
		
		List<Integer> intList=Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		//intList.forEach(n->System.out.println(n));
		intList.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		
		
		String[] arr2= {"India","China"};
		List<String> list=Arrays.asList(arr2);
	}

}
