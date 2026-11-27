package com.overriding;

public class Manager extends Employee {

	@Override
	double calculateSalary() {
	
		return 20000+getSalary();
	}
}
