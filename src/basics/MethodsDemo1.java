package basics;

public class MethodsDemo1 {
	
	//instance method
	void login() {
		System.out.println("login instance method");
	}
	
	//static method
	static void search() {
		System.out.println("search static method");
	}
	
	
	public static void main(String[] args) {
		MethodsDemo1 obj=new MethodsDemo1();
		obj.login();
		
		MethodsDemo1.search();
		
		
	}

}


/*
Methods:

1. Code reusability

2. Readability and easier to understand


syntax:
[access_modifier] [static] return_type method_name(params_list) throws Exception{
--
--
--
--

}

1. Instance method
syntax:
[access_modifier] return_type method_name(params_list) throws Exception{
--
--
--
--

}

2. Static method
[access_modifier] static return_type method_name(params_list) throws Exception{
--
--
--
--

}


*/