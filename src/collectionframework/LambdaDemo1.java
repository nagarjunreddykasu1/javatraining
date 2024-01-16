package collectionframework;

public class LambdaDemo1 {
	
	public static void main(String[] args) {
		
		/*
		 * InterfaceTest obj=new InterfaceTest() { public void add() {
		 * System.out.println("add method"); } }; obj.add();
		 * 
		 * 
		 * InterfaceTest ob=()->{System.out.println("add method using lambda exp..");};
		 * ob.add();
		 */
		
		
		//InterfaceTest ob=(i,j)->{System.out.println("add method using lambda exp.."+(i+j));};
		
		InterfaceTest ob=(i,j)-> i+j;
		
		int result=ob.add(20,30);
		System.out.println(result);
	}
	

}



/*
Lambda Expressions:
----------------------

Functional Interface:
It is an interface which contains only one abstract method.

@FunctionalInterface


*/