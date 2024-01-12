package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Reusable {
	
	
	public static ArrayList<String> compareArrayLists(ArrayList<String> actual, ArrayList<String> expected) {
		
		Iterator<String> itr=actual.iterator();
		
		while(itr.hasNext()) {
			String name=itr.next();
			if(expected.remove(name)) {
				itr.remove();
			}
		}
		
		ArrayList<String> unmatched=new ArrayList<>(actual);
		//unmatched.addAll(al1);
		unmatched.addAll(expected);
		
		return unmatched;
		
	}
	
	
	
	
	

}
