package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {
	
	
	void getData() throws FileNotFoundException{
		
		FileInputStream fis=new FileInputStream("pathofexcelfile");
		
	}
	
	public static void main(String[] args) {
		
	}

}
