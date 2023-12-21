package basics;

public class ForDemo2 {
	
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*\t");
			}
			System.out.println();
			
			
			
		}
		
	}

}

/*
Nested for:
for(in, cond, modi){

	for(in, cond, modi){
	
	}

}

*
*	*
*	*	*
*	*	*	*
*	*	*	*	*
*	*	*	*	*	*
*	*	*	*	*	*	*
*	*	*	*	*	*	*	*
*	*	*	*	*	*	*	*	*
*	*	*	*	*	*	*	*	*	*


*/