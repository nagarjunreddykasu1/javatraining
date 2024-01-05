package exceptionhandling;

public class ExceptionsDemo2 {
	
	
	/*
	 * public void verifyData() { try {
	 * 
	 * 
	 * } catch(Exception e) {
	 * 
	 * } }
	 */
	
	public static void main(String[] args) throws Exception {
		try {
			System.out.println("starting of the program");
			int[] arr= {1,4,6,7};
			System.out.println(arr[6]);
			System.out.println("printed array elements");
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("catch block");
			
			
			/*
			 * System.out.println("Exception message: "+e.getMessage());
			 * System.out.println(e.toString());
			 * System.out.println(e.getLocalizedMessage());
			 * 
			 * e.printStackTrace();
			 */
			
			
			throw new Exception("Index out of bound exception occurred");
		}
		
		
		
	}

}

/*
throw:
throw is used to throw a custom exception explicitly.

throws:
throws keyword is used when we have checked / compile time exceptions.
it is used to declare the type of exception that might occur within the method.
It is used in method declaration.




*/