package basics;

public class NestedIf {
	
	public static void main(String[] args) {
		
		int a=100, b=200,c=30;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a value is largest");
			}
			else {
				System.out.println("c value is largest");
			}
		}
		else
		{
			if(b>c) {
				System.out.println("b value is largest");
			}
			else {
				System.out.println("c value is largest");
			}
			
		}
		
		
		
	}

}


/*

syntax:

if(condition1){

	if(condition2){
	---
	--
	--
	
	}
	else if(condition3){
	---
	--
	---
	}


}
else if(condition4){

}


*/