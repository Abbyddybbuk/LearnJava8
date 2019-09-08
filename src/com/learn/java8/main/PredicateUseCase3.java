package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.w3c.dom.NameList;

public class PredicateUseCase3 {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		List<String> finalNameList = new ArrayList<String>();
		nameList.add("Abhijeet");
		nameList.add(null);
		nameList.add("Abhinav");
		nameList.add("");
		nameList.add(null);
		nameList.add("Subhav");

		System.out.println("Unfiltered List: " + nameList);
		Predicate<String> pCond = name -> name != null && name.length() != 0;

		System.out.println("Filtered List: " + applyFilter(pCond, nameList));

	}

	public static List<String> applyFilter(Predicate<String> pCond, List<String> nameList) {
		List<String> finalNameList = new ArrayList<String>();
		for (String name : nameList) {
			if (pCond.test(name))
				finalNameList.add(name);
		}
		return finalNameList;
	}

}
