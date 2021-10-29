package com.bz.employee_wage;

public class EmployeeWage {
	/*
	 * calculate employee present or absent using random function. calculating
	 * employee wage. Added part time to calculate employee wage.
	 * Applied switch statement.
	 */
	public static void main(String[] args) {
		int RATE_PER_HR = 20;
		int FULL_DAY_HR = 8;
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 0;
		System.out.println("Welcome to EmPloyee Wage Program");
		int empCheck = (int) (Math.random() * 10) % 2;
		int empHrs = 0;
		switch (empCheck) {
		case IS_PART_TIME:
			empHrs = 4;
			break;
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
			break;
		}
		int empWage = empHrs * RATE_PER_HR;
		System.out.println("Emp Wage: " + empWage);
	}
}