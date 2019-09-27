package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUseCase2 {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add("Abhijeet");
		nameList.add("Naresh");
		nameList.add("Sukesh");
		nameList.add("Amitabh");
		nameList.add("Abhishek");

		List<String> finalNameList = nameList.stream().filter(name -> name.length() > 6).collect(Collectors.toList());

		System.out.println(finalNameList);

		long countNum = nameList.stream().filter(name -> name.length() > 6).count();
		System.out.println(countNum);

		// Sorted Example
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(0);
		numList.add(10);
		numList.add(5);
		numList.add(20);
		numList.add(25);
		numList.add(15);
		System.out.println("Unsorted List: " + numList);

		// Sort in Ascending order
		List<Integer> sortedNumList = numList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List: " + sortedNumList);

		// Sort in Descending order
		List<Integer> sortedDescList = numList.stream().sorted((elm1, elm2) -> elm2.compareTo(elm1))
				.collect(Collectors.toList());
		System.out.println("Sorted List in Descending Order " + sortedDescList);
		
		Integer minValue = sortedNumList.stream().min((num1, num2) -> num1.compareTo(num2)).get();
		System.out.println("Min Value is: " + minValue);

	}

}
