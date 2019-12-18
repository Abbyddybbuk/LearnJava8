package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPractice1 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(0);
		numList.add(5);
		numList.add(10);
		numList.add(20);
		numList.add(25);
		numList.add(30);
		numList.add(35);
		numList.add(40);
		System.out.println(numList);
		
		// Adding a filter
		List<Integer> numList1 = numList.stream().filter(num->num % 2==0).collect(Collectors.toList());
		System.out.println(numList1);
		
		// Adding a map
		List<Integer> numList2 = numList.stream().map(num -> num * 2).collect(Collectors.toList());
		System.out.println(numList2);

	}

}
