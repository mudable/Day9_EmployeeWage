package com.bz.employee_wage;

public class EmployeeWage {
	/*
	 * calculate employee present or absent using random function.
	 */
	public static void main(String[] args) {
		System.out.println("Wel come to Employee Wage Problem");
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
