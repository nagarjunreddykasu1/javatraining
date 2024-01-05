package exceptionhandling;

public class ExceptionsDemo4 {
	
	
	void verify() throws InterruptedException{
		System.out.println("verifying data");
		Thread.sleep(3000);
		System.out.println("end of the method");
	}
	
	void calc() throws Exception {
		try {
			System.out.println("calculations");
			int result=20/0;
			System.out.println("calc method ended...");
		}
		catch(Exception e) {
			
			//e.printStackTrace();
			
			throw new Exception("there is an exception divison by zeo");
			
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		ExceptionsDemo4 obj=new ExceptionsDemo4();
		obj.calc();
		
		
	}

}
