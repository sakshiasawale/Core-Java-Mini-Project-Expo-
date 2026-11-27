package com.overriding;

public class Employee {

	private double salary;
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	double calculateSalary()
	{
		return salary;
	}
}
