package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionUseCase5 {

	public static void main(String[] args) {
		List<EmployeeSalary> empSalaryList = new ArrayList<EmployeeSalary>();
		empSalaryList.add(new EmployeeSalary("Abhijeet", 10000.00));
		empSalaryList.add(new EmployeeSalary("Sameer", 30000.00));
		empSalaryList.add(new EmployeeSalary("Ajit", 9000.00));
		empSalaryList.add(new EmployeeSalary("Naresh", 60000.00));
		empSalaryList.add(new EmployeeSalary("Sikandar", 90000.00));
		empSalaryList.add(new EmployeeSalary("Pushpa", 80000.00));
		empSalaryList.add(new EmployeeSalary("Sachin", 80000.00));

		Predicate<EmployeeSalary> pEmpSalary = empSal -> empSal.getSalary() <= 10000.00;

		Function<EmployeeSalary, EmployeeSalary> fIncrement = empSal -> {
			Double newSalary = 0.00;
			newSalary = empSal.getSalary() + 30000;
			empSal.setSalary(newSalary);
			return empSal;
		};
        
		// Calculate Salary
		calcSalary(pEmpSalary, fIncrement, empSalaryList);

	}

	public static void calcSalary(Predicate<EmployeeSalary> pEmpSalary,
			Function<EmployeeSalary, EmployeeSalary> fIncrement, List<EmployeeSalary> empSalaryList) {
		for (EmployeeSalary empSal : empSalaryList) {
			if (pEmpSalary.test(empSal)) {
				EmployeeSalary newSal = fIncrement.apply(empSal);
				System.out
						.println("Congratulations " + newSal.getName() + " ,your new salary is " + newSal.getSalary());
			}
		}
	}

}
