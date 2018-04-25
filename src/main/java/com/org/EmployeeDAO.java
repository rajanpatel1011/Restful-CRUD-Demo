package com.org;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeDAO {

	private Set<Employee> employeeDatabase = new HashSet<>();
	
	public boolean  storeEmployee(Employee employee) {
		boolean status = employeeDatabase.add(employee);
		System.out.println("Employe added "+employeeDatabase.size());
		return status;
	}
	
	public Employee getEmployee(int id) {
		Iterator<Employee> iterator = employeeDatabase.iterator();
		Employee employee = null;
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			if(e.getEmpId()==id) {
				employee = e;
				break;
			}
			
			
		}
		return employee;
	 }
	
	public boolean removeEmployee(int id) {
		Employee employee = getEmployee(id);
		return employeeDatabase.remove(employee);
	}
	
	public Employee updateEmployeeSalary(int id, double salary) {
		Employee employee = getEmployee(id);
		if(employee != null) {
			employee.setEmpSalary(salary);
		}
		return employee;
	}
	public Set<Employee> getAllEmployee(){
		return employeeDatabase;
	}
}
