package collectionframework;

import java.util.ArrayList;

public class NonRepetitiveNumbers {
	
	public static void main(String[] args) {
		int[] arr= {4,3,2,5,4,3,5,4,10,11,2,1,13};
		
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j] = 0;
					count++;
				}
			}
			if(count == 0 && arr[i] != 0) {
				al.add(arr[i]);
			}
		}
		
		System.out.println("Non Repetitive Numbers: "+al);
		
		
		
	}

}
