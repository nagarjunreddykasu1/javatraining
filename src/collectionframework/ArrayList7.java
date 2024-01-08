package collectionframework;

import java.util.ArrayList;

public class ArrayList7 {
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee(100, "Nag");
		
		ArrayList<Employee> al=new ArrayList<>();
		
		al.add(emp1);
		al.add(new Employee(102,"Srinivas"));
		
		
		ArrayList<Employee> al2=new ArrayList<>(al);
		//al2.addAll(al);
		
		for(Employee emp:al) {
			System.out.println(emp.empId+" --- "+emp.employeeName);
		}
	}

}
