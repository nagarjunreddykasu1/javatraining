package constructors;

public class ConstructorsDemo8 {
	
	
	ConstructorsDemo8(Search obj){
		System.out.println(obj.count);
		obj.searchDocuments();
	}
	
	ConstructorsDemo8(){
		
	}
	
	ConstructorsDemo8(int a){
		
	}
	
	ConstructorsDemo8(String username, String password){
		this();
		//this(10);
	}
	
	public static void main(String[] args) {
		
		new ConstructorsDemo8(new Search());
		
	}

}
