package arrays;

public class ArraysDemo7 {
	
	//int[] in= {};
	
	public static void main(String[] args) {
		
		int[][] arr= {{1,2,3,4},{2,4,6},{8,3,2,4,5}};
		
		
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		
		//to print all the elements using for loop
		System.out.println("*** using for loop ***");
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+"\t");
			}
			
			System.out.println();
		}
		
		//using for each loop
		System.out.println("*** using for each loop ***");
		
		for(int[] i:arr) {
			for(int data:i) {
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}

/*
		Col1		Col2			col3	

row1	arr[0][0]	arr[0][1]		arr[0][2]

row2	arr[1][0]	arr[1][1]		arr[1][2]

row3	arr[2][0]	arr[2][1]		arr[2][2]



*/