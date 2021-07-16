package org.ram.employeeApp;

public class Test {
public static void main(String[] args) {
//	System.out.println("hello");
	EmployeeServiceImpl employeeServiceImpl=new EmployeeServiceImpl();
	employeeServiceImpl.addEmployeeReocrd();
//	employeeServiceImpl.showEmployeeByDepartment("IT");
//	employeeServiceImpl.calculateAndShowSalariesOfEmployee();
//	employeeServiceImpl.displayEmployeeWithHighestSalary();
//	employeeServiceImpl.sortEmployeeDetailsByDepartmentAndSalary();
//	employeeServiceImpl.countTotalEmployeePerDepartment();
	employeeServiceImpl.calculateAverageSalaryPerDepartment();
//	employeeServiceImpl.firstFiveEmployees();
//	employeeServiceImpl.employeeFromSecondToFifthIndex();
//	employeeServiceImpl.listOfEmployeePerDepartment();
}
}
