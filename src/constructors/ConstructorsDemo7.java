package constructors;

public class ConstructorsDemo7 {
	
	ConstructorsDemo7(Search s){
		
		System.out.println(s.count);
		s.searchDocuments();
	}
	
	
	public static void main(String[] args) {
		
		Search search=new Search();
		ConstructorsDemo7 obj=new ConstructorsDemo7(search);
		
	}

}
