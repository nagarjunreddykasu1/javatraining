package arrays;

public class ArraysDemo5 {
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee(101,"Nag");
		Employee emp2=new Employee(102,"Srinivas");
		Employee emp3=new Employee(103,"Ravi");
		
		
		Employee[] emp=new Employee[3];
		
		emp[0]=emp1;
		emp[1]=emp2;
		emp[2]=emp3;
		
		//using for loop
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i].empId+" --- "+emp[i].employeeName);
		}
		
		
		//using for each loop
		for(Employee e:emp) {
			System.out.println(e.empId+" --- "+e.employeeName);
		}
		
		
		
		
	}

}
