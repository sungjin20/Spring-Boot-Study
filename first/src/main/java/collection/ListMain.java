package collection;

import java.util.ArrayList;

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사번:" + id + " 이름:" + name + " 급여: " + salary;
	}
}

class EmployeeManager{
	ArrayList<Employee> getEmployees() {
		ArrayList<Employee> empList = new ArrayList<Employee>(2);
		empList.add(new Employee(100, "이사원", 60000.99));
		empList.add(new Employee(200, "이사원", 60000.99));
		empList.add(new Employee(300, "이사원", 60000.99));
		empList.add(new Employee(400, "이사원", 60000.99));
		empList.add(new Employee(500, "이사원", 60000.99));
		
		return empList;
	}
}

public class ListMain {
	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager();
		ArrayList<Employee> empList = manager.getEmployees();
		for(Employee emp : empList) {
			System.out.println(emp);
		}
	}
}
