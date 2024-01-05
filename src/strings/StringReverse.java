package strings;

public class StringReverse {
	
	public static void main(String[] args) {
		String name="India is my country";
		
		//reverse each word
		
		String[] arr=name.split(" ");
		StringBuilder sb = null;
		
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<arr.length;i++){
			sb=new StringBuilder(arr[i]);
			sb.reverse();
			sb2.append(sb+" ");
		}
		
		System.out.println(sb2);
	}

}
