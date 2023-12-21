package basics;

public class SwitchDemo {
	
	public static void main(String[] args) {
		
		//int num=4;
		
		switch(6) {
		//System.out.println("");
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
				System.out.println("default block");
		
		}
	}

}


/*
syntax:

switch(arg){

	case label1:
	    ---
	    ---
	    break;
	case label2:
		--
			-
			
		break;
	
	default:
	 --
	 --
	 
	   
}




*/