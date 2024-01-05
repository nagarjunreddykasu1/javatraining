package strings;

public class StringDemo2 {
	
	public static void main(String[] args) {
		String message="There are only 3 items available which costs Rs.200/- each.";
		
		String[] arr=message.split(" ");
		
		System.out.println(arr[3]);
		
		System.out.println(arr[8].split("s.")[1].split("/")[0]);
		
		
	}

}
