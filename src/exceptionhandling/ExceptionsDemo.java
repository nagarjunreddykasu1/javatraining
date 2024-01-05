package exceptionhandling;

public class ExceptionsDemo {
	
	
	public static void main(String[] args) {
		try {
			System.out.println("starting of the program");
			int[] arr= {1,4,6,7};
			System.out.println(arr[6]);
			System.out.println("printed array elements");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException catch block");
		}
		
		catch(ArrayIndexOutOfBoundsException ae) {
		  System.out.println("ArrayIndexOutOfBoundsException catch block");
		  }
		 
		catch(NullPointerException np) {
			System.out.println("NullPointerException catch block");
		}
		catch(Exception e) {
			System.out.println("catch block code");
		}
		
		
		
		
	}

}



/*
Exception Handling:
===================
Exception:
-----------
Exception is an event/problem that disrupts the normal flow of the program execution.

exceptions can occur at compile time or run time.

We can handle / recover the exceptions.

Error:
------
Errors are the problems that occurs due to lack system sources.

Errors can occur at run time only.

We can not handle the errors.


Exception handling is a mechanism to handle the compile time or run time errors.
java.lang
IOException
ArrayIndexOutOfBoundException
ClassNotFound
NoSuchElementFound
NullPointer
ArithmeticException

...

2 types of exceptions:

1. Checked Exceptions: compile time exceptions
The exceptions which are checked by the compiler at the time of compilation are called checked exceptions.
ex: IOExecption, SQLException, InterruptedException

2. Unchecked Exceptions: runtime exceptions
The exceptions which are not checked by the compiler at the time of compilation are called unchecked exceptions.
ex:
ArrayIndexOutOfBound
NullPointer
Arithmetic
NoSuchElementFound


					Throwable
					
	Exception						Error	
	
	
	IOException							OutOfMemoryError
										StackOverflowError
	SQLException
	ClassNotFound
	RuntimeException
			ArithmeticException
			NullpointerExcetion
			IndexOutOfBoundException
			...
		

































*/