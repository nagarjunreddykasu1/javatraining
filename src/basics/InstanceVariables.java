package basics;

public class InstanceVariables {
	//instance variable
	public int id;//0
	double d;//0.0
	
	
	public static void main(String[] args) {
		InstanceVariables obj=new InstanceVariables();
		
		System.out.println(obj.id);
		System.out.println(obj.d);
		
		
		System.out.println(new InstanceVariables().id);
		
		obj.id=20;
		
		System.out.println(obj.id);//20
		
		InstanceVariables obj2=new InstanceVariables();
		System.out.println(obj2.id);//0
		obj2.id=111;
		System.out.println(obj2.id);//111
		
		
		
		
		
	}

}

/*
Instance variables:
===================
The variables declared inside the class and outside of method or constructor or block are called instance variables.

Access modifiers can be given to instance variables.

Instance variables are visible in all methods.

Memory is allocated when the object is created for instance members.

Instance variables have default values.


Areas:
instance area

static area

Methods:
1. Instance method
2. Static method


syntax:
[access_modifier] [static] return_type method_name([paramslist]) throws Exception{
--
--
-
--
--

}

1. instance method

[access_modifier] return_type method_name([paramslist]) throws Exception{
--
--
-
--
--

}

ex: void click(){
--
--//body
--   instance area

--


}

2. static method

static void click(){
--

--- static area

--

}

Accessing instance variables:
==============================
					Instance variables/methods
					
					directly access				by using object
					
					Instance_area				static_area


Object Creation:
==================
1. Named object:

syntax: classname objref=new classname();

ex: Login obj=new Login();

2. Nameless object:

syntax: new classname();

ex: new Login();








*/