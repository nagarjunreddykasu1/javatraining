package arrays;

public class ArraysDemo6 {
	
	
	public void getArray(Employee[] arr) {
		//using for loop
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i].empId+" --- "+arr[i].employeeName);
				}
		
		
		
		
	}
	
	public static void main(String[] args) {
		Employee emp1=new Employee(101,"Nag");
		Employee emp2=new Employee(102,"Srinivas");
		Employee emp3=new Employee(103,"Ravi");
		
		
		Employee[] emp=new Employee[3];
		
		emp[0]=emp1;
		emp[1]=emp2;
		emp[2]=emp3;
		
		ArraysDemo6 obj=new ArraysDemo6();
		obj.getArray(emp);
		
		
		
	}
	

}
