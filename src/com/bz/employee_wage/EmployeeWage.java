package com.bz.employee_wage;

import java.util.Random;

public class EmployeeWage {
	// Constants
	final static int IS_PART_TIME = 1;
	final static int IS_FULL_TIME = 2;

	/*
	 * created function and passed the parameter to calculate total employee wage
	 * for particular company. by passing arguments inside function
	 */
	public static int calculateEmployeeWage(String company, int empRatePerHr, int numOfWorkingDays,
			int maxHrsPerMonth) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			Random random = new Random();
			int empCheck = random.nextInt(3);
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 8;
				break;
			case IS_FULL_TIME:
				empHrs = 12;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
			System.out.println("Days#" + totalWorkingDays + "EmpHrs :" + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHr;
		System.out.println("Total Emp Wage for company:" + company + "is:" + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		calculateEmployeeWage("jio", 20, 3, 15);
		calculateEmployeeWage("airtel", 20, 3, 15);
	}
}
