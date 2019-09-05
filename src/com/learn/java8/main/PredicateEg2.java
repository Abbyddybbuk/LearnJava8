package com.learn.java8.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEg2 {

	public static void main(String[] args) {
		Predicate<String> pEg1 = s1->s1.length() > 10;
		System.out.println(pEg1.test("Abhijeet"));
		System.out.println(pEg1.test("Abhijeet Kulshreshtha"));
		
		System.out.println("*************Second Predicate Example**********");
		List<String> empList = new ArrayList<String>();
//		empList.add("I066841");
		Predicate<Collection> pEg2 = col->col.isEmpty();
		System.out.println(pEg2.test(empList));
	}

}
