package basics;

public class StaticVariables2 {
	//instance variable
	int id=10;
	
	//static variable
	static String role="Admin";
	
	public static void main(String[] args) {
		StaticVariables2 obj=new StaticVariables2();
		System.out.println(obj.id);
		System.out.println(StaticVariables2.role);
		StaticVariables2.role="Analyst";
		obj.id=111;
		System.out.println(obj.id);//111
		
		StaticVariables2 obj2=new StaticVariables2();
		System.out.println(obj2.id);//10
		System.out.println(StaticVariables2.role);//Analyst
		
		
	}

}
