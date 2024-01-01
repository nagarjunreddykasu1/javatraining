package abstraction;

//concrete class
public class AbstractionDemo {
	
	
	public static void main(String[] args) {
		Bank icici=new ICICI();
		
		double ir=icici.getRateOfInterest();
		System.out.println(ir);
		
		Bank sbi=new SBI();
		double sr=sbi.getRateOfInterest();
		System.out.println(sr);
		
	}
	
	
	
	

}


/*
Abstraction:
============


NOTE: it is not possible to create object for abstract class. but we can hold the object in abstract class reference.


*/