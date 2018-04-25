package com.org;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
private int empId;
private String empName;
private double empSalary;



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empId;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (empId != other.empId)
		return false;
	return true;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}

}
