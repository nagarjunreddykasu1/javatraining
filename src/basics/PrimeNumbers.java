package basics;

//To print prime numbers from 1 to 50
public class PrimeNumbers {
	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) {
			boolean flag=false;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.println(i);
			}
		}
	}

}
