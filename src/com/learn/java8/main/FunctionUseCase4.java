package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionUseCase4 {

	public static void main(String[] args) {
		List<EmployeeSalary> empSalList = new ArrayList<EmployeeSalary>();
		empSalList.add(new EmployeeSalary("Abhijeet", 10000.00));
		empSalList.add(new EmployeeSalary("Ram", 78000.00));
		empSalList.add(new EmployeeSalary("Sita", 44000.00));
		empSalList.add(new EmployeeSalary("Suresh", 34500.00));
		empSalList.add(new EmployeeSalary("Ritesh", 97600.00));
		empSalList.add(new EmployeeSalary("SRK", 23400.00));
		empSalList.add(new EmployeeSalary("Sugandha", 89890.00));

		Function<List<EmployeeSalary>, Double> fCalcSal = empSalaryList -> {
			Double total = 0.0;
			for (EmployeeSalary empSal : empSalaryList) {
				total = total + empSal.getSalary();
			}
			return total;
		};
		
		System.out.println("Total Salary required is: " + fCalcSal.apply(empSalList));

	}

}
