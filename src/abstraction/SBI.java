package abstraction;

public class SBI extends Bank{

	@Override
	double getRateOfInterest() {
		System.out.println("getRateOfInterest method in SBI class");
		return 10.25;
	}

}
