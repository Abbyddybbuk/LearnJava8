package com.learn.java8.main;

import java.util.Comparator;

public class myComparator implements Comparator<Integer> {

	public int compare(Integer a, Integer b) {

		if (a > b) {
			return -1;
		} else if (a < b) {
			return 1;
		} else {
			return 0;
		}

	}

}
