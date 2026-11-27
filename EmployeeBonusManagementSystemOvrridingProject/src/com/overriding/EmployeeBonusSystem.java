package com.overriding;

public class EmployeeBonusSystem {

	public static void main(String[] args) {
		
		Employee employee;
		
		employee = new Developer();
		employee.setSalary(40000);
		System.out.println("Actual Salary for Developer:"+employee.getSalary());
		System.out.println("Developer Final Salary:"+employee.calculateSalary());
		
		employee = new Tester();
		employee.setSalary(35000);
		System.out.println("Actual Salary for Tester:"+employee.getSalary());
		System.out.println("Tester Final Salary:"+employee.calculateSalary());
		
		employee = new Manager();
		employee.setSalary(60000);
		System.out.println("Actual Salary for Manager:"+employee.getSalary());
		System.out.println("Manager Final Salary:"+employee.calculateSalary());
	}
}
