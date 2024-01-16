package collectionframework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo1 {
	
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Capgemini","XTGlobal","TCS","Infosys","ValueLabs","","");
		long emptyStringCount=list.stream().filter(x->x.isEmpty()).count();
		System.out.println(emptyStringCount);
		
		long countOfStrings=list.stream().filter(x->x.length()>4).count();
		System.out.println(countOfStrings);
		
		
		List<String> stringNames=list.stream().filter(x->x.length()>4).collect(Collectors.toList());
		System.out.println("Strings which length is >4: "+stringNames);
		
		List<String> nonEmptyStrings=list.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
		System.out.println("Non empty strings: "+nonEmptyStrings);
		
		
	}

}
