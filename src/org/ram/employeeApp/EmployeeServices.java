package org.ram.employeeApp;

import java.util.ArrayList;

public interface EmployeeServices {
	
	//program1
	public void addEmployeeReocrd();
	public ArrayList<String> showEmployeeByDepartment(String departmentName);
	public double calculateAndShowSalariesOfEmployee();
	public void displayEmployeeWithHighestSalary();
	public void sortEmployeeDetailsByDepartmentAndSalary();
	
	//program2
	public void listOfEmployeePerDepartment();
	public void countTotalEmployeePerDepartment();
	public void calculateAverageSalaryPerDepartment();
	public void firstFiveEmployees();
	public void employeeFromSecondToFifthIndex();
}
