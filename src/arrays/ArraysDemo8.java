package arrays;

import java.util.Arrays;

public class ArraysDemo8 {
	
	public static void main(String[] args) {
		
		int[] arr1= {2,4,5,7,8};
		int[] arr2= {2,4,5,7,8};
		
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Both arrays are equal");
		}
		else {
			System.out.println("both arrays are NOT equal");
		}
		
		
		Object[] obj1= {arr1};
		Object[] obj2= {arr2};
		
		if(Arrays.equals(obj1, obj2)) {
			System.out.println("array objects are equal");
		}
		else {
			System.out.println("array objects not equals");
		}
		
		
		if(Arrays.deepEquals(obj1, obj2)) {
			System.out.println("Arrays are equals");
		}
		else {
			System.out.println("Arrays are NOT equal....");
		}
		
		
		
		
		
		
	}

}

/*

Arrays class
equals()
deepEquals()


*/
