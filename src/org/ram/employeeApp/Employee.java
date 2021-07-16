package org.ram.employeeApp;

public class Employee implements Comparable<Object> {
	
	//private members of Employee
	private String firstName;
	private String lastName;
	private double salary;
	private String department;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	//parameterized constructor to initializing the members of Employee class
	public Employee(String firstName, String lastName, double salary, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Object o1) {
		
		 Employee e = (Employee)o1;
		 
	        int iSalComaprison = Double.compare(this.salary, e.salary);
	        if (iSalComaprison == 0)
	        {
	            return department.compareTo(e.department);
	        }
	        return iSalComaprison;
	}
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
	
}
