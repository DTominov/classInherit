package com.daniel.classes;

public class TestClass {

	public static void main(String[] args) {
		Employee employee = new  Employee();
		
		employee.setFirstName("John");
		employee.setLastName("Doe");
		employee.setGender("Male");
		employee.setSalary(50000.00);
		employee.setEmployeeId("EMP1234");
		System.out.print(employee.toString());
	}

}
