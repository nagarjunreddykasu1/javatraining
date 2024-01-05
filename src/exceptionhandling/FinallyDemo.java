package exceptionhandling;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
			System.out.println("starting of the program");
			int[] arr= {1,4,6,7};
			System.out.println(arr[1]);
			System.out.println("printed array elements");
		}

		catch(ArithmeticException | NullPointerException |
				ArrayIndexOutOfBoundsException e) { System.out.println("catch block"); 
		}

		finally {
			System.out.println("finally block code");
		}
	}


}
