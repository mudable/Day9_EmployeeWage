package com.bz.employee_wage;

public class EmployeeWage {
	/*calculate employee present or absent using random function.
	 * calculating employee wage.
	 */
	public static void main(String[] args) {
		int RATE_PER_HR = 20;
		int FULL_DAY_HR = 8;
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 0;

		int empHrs = 0;
		System.out.println("Welcome to EmPloyee Wage Program");
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) {
			empHrs = 8;
			System.out.println("Employee is Present full time ");
		} else if (empCheck == IS_PART_TIME) {
			empHrs = 4;
			System.out.println("Employee is present part time");
		} else {
			empHrs = 0;
			System.out.println("Employee is absent");
		}
		int empWage = empHrs * RATE_PER_HR;
		System.out.println("Emp Wage: " + empWage);
	}
}