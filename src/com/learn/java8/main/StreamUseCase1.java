package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUseCase1 {
    // Stream is a default method in Collection Interface; 
	// How to create Stream object Stream s = <Any Collection Object>.stream()
	// Stream is available in java.util.stream package
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(0);
		numList.add(10);
		numList.add(20);
		numList.add(5);
		numList.add(15);
		numList.add(25);
		
		//Initial Values
		System.out.println(numList);
		List<Integer> finalNumList = numList.stream().filter(num -> num%2==0).collect(Collectors.toList());
		
		//Sorted Values with Filter method usage
		System.out.println(finalNumList);

		// Double all the values in the list above numList
		List<Integer> calcList = numList.stream().map(num -> num * 2).collect(Collectors.toList());
		System.out.println(calcList);

	}

}
