package arrays;

public class ArraysDemo3 {
	
	//static method
	public static int[] getArray() {
		//int[] arr= {1,8,3,7,6,5,2};
		return new int[] {1,8,3,7,6,5,2};
	}
	
	
	public static void main(String[] args) {
		
		int[] arr=ArraysDemo3.getArray();
		
		for(int i:arr) {
			System.out.println(i);
		}
		
	}

}
