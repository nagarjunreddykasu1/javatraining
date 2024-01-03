package arrays;

public class ArraysDemo2 {
	
	//instance method
	public void getArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ArraysDemo2 obj = new ArraysDemo2();
		
		int[] arr= {1,8,3,7,6,5,2};
		
		obj.getArray(arr);
		
		
	}

}
