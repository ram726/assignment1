package org.ram.employeeApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeServices{
	
	ArrayList<Employee> employeesList=new ArrayList<Employee>();

	@Override
	public void addEmployeeReocrd() {
		
		Employee employee1=new Employee();
		employee1.setFirstName("M.S.");
		employee1.setLastName("Dhoni");
		employee1.setSalary(66000.56);
		employee1.setDepartment("IT");
		
		Employee employee2=new Employee();
		employee2.setFirstName("Sachin");
		employee2.setLastName("Tendulkar");
		employee2.setSalary(86000.78);
		employee2.setDepartment("Sales");
		
		Employee employee3=new Employee();
		employee3.setFirstName("Virat");
		employee3.setLastName("Kohli");
		employee3.setSalary(50000.90);
		employee3.setDepartment("Sales");
		
		Employee employee4=new Employee();
		employee4.setFirstName("Suresh");
		employee4.setLastName("Raina");
		employee4.setSalary(68000.12);
		employee4.setDepartment("IT");
		
		Employee employee5=new Employee();
		employee5.setFirstName("Rohit");
		employee5.setLastName("Sharma");
		employee5.setSalary(58000.34);
		employee5.setDepartment("Finance");
		
		Employee employee6=new Employee();
		employee6.setFirstName("Virender");
		employee6.setLastName("Sehwag");
		employee6.setSalary(43000);
		employee6.setDepartment("IT");
		
		Employee employee7=new Employee();
		employee7.setFirstName("Kunal");
		employee7.setLastName("Pandeya");
		employee7.setSalary(38000.34);
		employee7.setDepartment("Finance");
		
		employeesList.add(employee1);
		employeesList.add(employee2);
		employeesList.add(employee3);
		employeesList.add(employee4);
		employeesList.add(employee5);
		employeesList.add(employee6);
		employeesList.add(employee7);
	}

	@Override
	public ArrayList<String> showEmployeeByDepartment(String departmentName) {
		Employee employee=new Employee();
		ArrayList<String> empName=new ArrayList<>();
		
		if(departmentName==null)
			return null;
			
			for(Employee emp:employeesList) {
				
				if(emp.getDepartment().equals(departmentName)) {
					empName.add(emp.getFirstName());
					//System.out.println(emp.getFirstName());
				}
			}
		return empName;
	}

	@Override
	public double calculateAndShowSalariesOfEmployee() {
		double sumSalary=0.0;
		for(Employee emp:employeesList) {
			sumSalary+=emp.getSalary();
		}
		System.out.println("Total salary is: "+sumSalary);
		return sumSalary;
	}

	@Override
	public void displayEmployeeWithHighestSalary() {
		
//		// calling max() method.
		  Employee empWithMaxSalary = Collections.max(employeesList);
		  System.out.println("Maximum Salary is : " + empWithMaxSalary.getSalary() + " for Employee : " + empWithMaxSalary.getFirstName() +" "+empWithMaxSalary.getLastName());
		
	}

	@Override
	public void sortEmployeeDetailsByDepartmentAndSalary() {
		Collections.sort(employeesList,(e1,e2)->e1.getDepartment().compareTo(e2.getDepartment()));
		System.out.println("Employee record sorted according to department");
		for(Employee emp:employeesList) {
			System.out.println("Name: "+emp.getFirstName()+" "+emp.getLastName());
			System.out.println("Department: "+emp.getDepartment());
			System.out.println("Salary: "+emp.getSalary());
			System.out.println("---------------------------------");
			}
		}
	
	
	//question2
	@Override
	public void calculateAverageSalaryPerDepartment() {
		HashMap<String,Integer> map=new HashMap<>();
		for(Employee emp:employeesList)
		{
			 if(map.containsKey(emp.getDepartment()))
			{
				map.put(emp.getDepartment(), map.get(emp.getDepartment())+1);
			}
			else
			{
				map.put(emp.getDepartment(), 1);
			}
		}
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("Average Salary of department "+entry.getKey()+" is "+calculateAvg(entry.getKey(),entry.getValue()));
		}
	}
	public double calculateAvg(String dept,int count) {
		double avg=0.0;
			for(Employee emp:employeesList) {
				
				if(emp.getDepartment().equals(dept)) {
					avg+=emp.getSalary();
				}
			}
		return avg/count;
	}

	@Override
	public void countTotalEmployeePerDepartment() {
		HashMap<String,Integer> map=new HashMap<>();
		for(Employee emp:employeesList)
		{
			 if(map.containsKey(emp.getDepartment()))
			{
				map.put(emp.getDepartment(), map.get(emp.getDepartment())+1);
			}
			else
			{
				map.put(emp.getDepartment(), 1);
			}
		}
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("Employee working on department "+entry.getKey()+" is "+entry.getValue());
		}
	}

	@Override
	public void firstFiveEmployees() {
		System.out.println("Size of List is: "+employeesList.size());
		ArrayList<Employee> fiveEmployee = new ArrayList<>();
		for(Employee e:employeesList) {
			System.out.println(e.getFirstName()+" "+e.getLastName()+" Working in "+e.getDepartment()+" having salary " +e.getSalary());
		}
		for (int i = 0; i < 5; i++) {
			fiveEmployee.add(employeesList.get(i));
		}
		System.out.println("First 5 record from the list.");
		for(Employee e:fiveEmployee) {
			System.out.println(e.getFirstName()+" "+e.getLastName()+" Working in "+e.getDepartment()+" having salary " +e.getSalary());
		}
	}

	@Override
	public void employeeFromSecondToFifthIndex() {
		ArrayList<Employee> employeeFromSecondToFifthIndex = new ArrayList<>();
		for(int i=1;i<5;i++) {
			employeeFromSecondToFifthIndex.add(employeesList.get(i));
		}
		System.out.println("Employee from 2-5 index.");
		for(Employee e:employeeFromSecondToFifthIndex) {
			System.out.println(e.getFirstName()+" "+e.getLastName()+" Working in "+e.getDepartment()+" having salary " +e.getSalary());
		}
	}

	@Override
	public void listOfEmployeePerDepartment() {
		
	}
	
	}
