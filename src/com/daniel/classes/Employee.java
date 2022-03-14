package com.daniel.classes;

public class Employee extends Person {

	private String employeeId;
	private Double salary;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", salary=" + salary + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getGender()=" + getGender() + "]";
	}

}
