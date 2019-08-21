package com.learn.java8.main;

import java.util.TreeMap;

public class MyTreeMap {

	public static void main(String[] args) {
//		TreeMap does not allow duplicates and default sorting order for key is followed		
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>((a, b)-> (a > b)?-1: (a < b)?1: 0);
		tMap.put(100, "Abhijeet");
		tMap.put(50, "Abhi");
		tMap.put(32, "Sukant");
		tMap.put(34, "Suresh");
		tMap.put(66, "Ramesh");
		tMap.put(88, "Suyash");
		tMap.put(12, "Arishi");
		tMap.put(14, "Muni");
		tMap.put(54, "Naresh");
		tMap.put(78, "Sumant");
		System.out.println(tMap);
	}

}
