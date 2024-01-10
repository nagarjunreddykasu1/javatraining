package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList14 {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("India");
		al.add("Pakistan");
		al.add("China");
		al.add("United States");
		al.add("Australia");
		
		
		String[] arr=new String[al.size()];
		al.toArray(arr);
		
		System.out.println("--- Using for loop ---");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(" --- Using for each loop ---");
		for(String name:arr) {
			System.out.println(name);
		}
		
		
		int[] intArr= {4,3,2,5,4,3,5,4,10,11,2,1,13};
		
		ArrayList<Integer> duplicate=new ArrayList<>();
		ArrayList<Integer> single=new ArrayList<>();
		for(int i=0;i<intArr.length;i++) {
			if(duplicate.contains(intArr[i])){
				break;
			}
			else {
				duplicate.add(intArr[i]);
			}
		}
		
		List<Integer> singleNumbersList = new ArrayList<>();

        for (int number : intArr) {
            if (!singleNumbersList.contains(number)) {
                singleNumbersList.add(number);
            } else {
                singleNumbersList.remove(Integer.valueOf(number));
            }
        }
        
		System.out.println("Duplicate numbers: "+duplicate);
		System.out.println("Single numbers: "+singleNumbersList);
		
		
		
		
	}

}
