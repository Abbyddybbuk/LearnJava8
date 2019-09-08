package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateUseCase2 {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add("Abhijeet");
		nameList.add("Ojas");
		nameList.add("Abhinav");
		nameList.add("Suresh");
		nameList.add("Tejas");
		nameList.add("Abhinav");

		Predicate<String> startWithA = sA -> sA.charAt(0) == 'A';
        
		System.out.println("*****Calling Predicate Check Method*****");
		checkMethod(startWithA, nameList);
	}

	public static void checkMethod(Predicate<String> startWithA, List<String> nameList) {
		for (String name : nameList) {
			if (startWithA.test(name))
				System.out.println(name);
		}
	}

}
