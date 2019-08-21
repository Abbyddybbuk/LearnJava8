package com.learn.java8.main;

import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {
//		Duplicates are not allowed
		TreeSet<Integer> tSet = new TreeSet<Integer>((a, b)-> (a > b)?-1: (a < b)?1: 0);
		tSet.add(10);
		tSet.add(0);
		tSet.add(16);
		tSet.add(11);
		tSet.add(18);
		tSet.add(88);
		tSet.add(10);
		tSet.add(65);
		tSet.add(99);
		
		// TreeSet Follows Natural Sorting Order
		System.out.println(tSet);

	}

}
