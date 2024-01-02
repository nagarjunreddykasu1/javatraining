package arrays;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		int[] arr= {1,3,5,4,6,7,8,10,20,15,16};
		
		/*
		 * int[] arr2=new int[10]; arr[0]=1; arr[1]=4;
		 */
		
		System.out.println("Number of elements: "+arr.length);
		
		
		  //To print values System.out.println("*** Using for loop ****"); 
		for(int i=0;i<arr.length;i++) { 
			System.out.println(arr[i]);
		}
		 
		
		System.out.println("*** Using for each loop ****");
		for(int j:arr) {
			System.out.println(j);
		}
		
		
	}

}


/*
Arrays:
========
Arrays are used to store multiple similar type of values into single variable.

syntax:
 datatype[] refvariable;
 
 datatype refvariable[];
 
 datatype[] refvariable=new datatype[size];
 datatype refvariable[]=new datatype[size];
 
 datatype[] refvariable={values, value2, valu3,......};
 
 Arrays are fixed in size.

Array is index based. index starts from 0.

1st element stored 0th index, 2nd element store in 1st index.......

We can store both primitive type of values and objects.

1. Single Dimensional array:


2. Multi Dimensional array




*/