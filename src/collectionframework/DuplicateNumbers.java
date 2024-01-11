package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class DuplicateNumbers {
	public static void main(String[] args) {
		int[] arr= {4,3,2,5,4,3,5,4,10,11,2,1,13};
		
		LinkedList<Integer> duplicate=new LinkedList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(duplicate.contains(arr[i])){
				break;
			}
			else {
				duplicate.add(arr[i]);
			}
		}
		
		System.out.println("Duplicate Numbers: "+duplicate);
	}

}
