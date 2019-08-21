package com.learn.java8.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecEmployee {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(200, "Abhijeet"));
		emplist.add(new Employee(100, "Suyash"));
		emplist.add(new Employee(150, "Sukant"));
		emplist.add(new Employee(400, "Hussain"));
		emplist.add(new Employee(300, "Somesh"));
		emplist.add(new Employee(43, "Ramesh"));
		emplist.add(new Employee(67, "Raksha"));
        System.out.println("Before Sorting: " + emplist);
		Collections.sort(emplist, (e1, e2) -> (e1.empNo < e2.empNo) ? -1 : (e1.empNo > e2.empNo) ? 1 : 0);
		System.out.println("After Sorting: " + emplist);
	}

}
