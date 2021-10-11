package com.learn.java8.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DuplicateRemovalDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Abhijeet"));
		empList.add(new Employee(1, "Abhijeet"));
		empList.add(new Employee(1, "Abhijeet"));
		empList.add(new Employee(1, "Abhijeet"));
		empList.add(new Employee(1, "Abhijeet"));
		empList.add(new Employee(1, "Abhijeet"));
		empList.add(new Employee(1, "Abhijeet"));
		empList.add(new Employee(2, "Abhinav"));
		empList.add(new Employee(3, "Akash"));
		empList.add(new Employee(3, "Akash"));
		empList.add(new Employee(4, "Ajeet"));
		
		Set<Employee> empSet = empList.stream().collect(Collectors.toCollection(() -> new TreeSet<Employee>(
				Comparator.comparing(Employee::getEmpNo).thenComparing(Employee::getEmpName))));
		
		empSet.forEach(emp -> System.out.println(emp.getEmpNo() + " " + emp.getEmpName()));

	}

}
