package com.learn.java8.main;

import java.util.*;
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

		List<Employee> employeeList = empSet.stream().toList();
		ListIterator<Employee> employeeListIterator = employeeList.listIterator();
		while (employeeListIterator.hasNext()) {
			System.out.println(employeeListIterator.next());
		}
	}

}
