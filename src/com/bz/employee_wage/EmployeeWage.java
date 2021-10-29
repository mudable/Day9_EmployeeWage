package com.bz.employee_wage;

import java.util.Random;

public class EmployeeWage {
	final static int IS_PART_TIME = 1;
	final static int IS_FULL_TIME = 2;
	static int EMP_RATE_PER_HOUR = 100;
	static int NO_OF_WORKING_DAYS = 20;
	static int MAX_HRS_IN_THE_MONTH = 10;
	int empHrs;
	int totalEmpHrs = 0;
	int totalWorkingDays = 0;
	int totalEmpWage = 0;

	/*
	 * calculate employee present or absent using random function. calculating
	 * employee wage. Added part time to calculate employee wage. Applied switch
	 * statement.
	 */
	public void calculateEmpWage() {
		while (totalEmpHrs <= MAX_HRS_IN_THE_MONTH && totalWorkingDays < NO_OF_WORKING_DAYS) {
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
		}
	}

	public int empHour() {
		System.out.println("Days#" + totalWorkingDays + "EmpHrs :" + empHrs);
		return totalEmpHrs += empHrs;
	}

	public int totalEmpWage() {
		int value = empHour();
		return totalEmpWage = value * EMP_RATE_PER_HOUR;
	}

	public static void main(String[] args) {
		EmployeeWage obj = new EmployeeWage();
		obj.calculateEmpWage();
		obj.totalEmpWage();
		System.out.println("Total Emp Wage:" + obj.totalEmpWage);
	}
}
