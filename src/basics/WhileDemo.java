package basics;

public class WhileDemo {
	
	public static void main(String[] args) {
		
		int num=1;
		//To print 1 to 10 numbers
		/*
		 * while(num<=10) {
		 * 
		 * System.out.println(num); num++;
		 * 
		 * }
		 */
		
		
		//To print only even numbers from 1 to 20
		
		while(num<=20) {
			if(num%2==0) {
				System.out.println(num);
			}
			num++;
		}
		
		
		
	}
	

}


/*
syntax:

while(condition){


---
--
statements;
---


}


*/