package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList13 {
	
	public static void main(String[] args) {
		//conversion of string array to ArrayList
		
		String[] arr= {"India","China","Pakistan","United States","Russia"};
		
		List<String> list=Arrays.asList(arr);
		
		for(String str:list) {
			System.out.println(str);
		}
		
		ArrayList<String> al=new ArrayList<>(Arrays.asList(arr));
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}

}
