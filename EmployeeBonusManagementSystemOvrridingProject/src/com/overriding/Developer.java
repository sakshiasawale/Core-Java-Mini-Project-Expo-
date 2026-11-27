package com.overriding;

public class Developer extends Employee {

	@Override
	public double calculateSalary() {
		
		return 10000+getSalary();
	}
	
}
