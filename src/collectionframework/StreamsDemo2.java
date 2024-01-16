package collectionframework;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsDemo2 {
	
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Capgemini","XTGlobal","TCS","Infosys","ValueLabs");
		
		String names=list.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(names);
		
		
		List<Integer> numbers=Arrays.asList(1,3,4,5,6,7);
		IntSummaryStatistics stats= numbers.stream().mapToInt((x) ->x).summaryStatistics();
		
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getSum());
		System.out.println(stats.getAverage());
		System.out.println(stats.getCount());
		
		
		
		
		
		
		
	}

}
