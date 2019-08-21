 package com.learn.java8.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortDemoJava8 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(8);
		numList.add(20);
		numList.add(27);
		numList.add(23);
		numList.add(50);
		numList.add(3);
		numList.add(2);
		numList.add(99);
		numList.add(55);
		numList.add(56);
		numList.add(77);
		numList.add(82);
		System.out.println("Before Sorting: " + numList);

//		In order to sort a list, Collections.sort() has to be used and a custom comparator can be passed
//		This custom comparator has to be a class implementing comparator interface:->method compare
		Collections.sort(numList, (a, b)-> (a > b)?-1: (a < b)?1: 0);
		System.out.println("After Sorting: " + numList);

	}

}
