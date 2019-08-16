package com.learn.java8.main;

import java.util.HashMap;

public class MapConcepts {

	public static void main(String[] args) {
//	HashMap is used for persisting group of objects in the form of key-value pairs
//		* Duplicate Keys are not allowed
//		* Sort Order is not preserved

		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put("SAP", "ABAP");
		hMap.put("MICROSOFT", ".NET");
		hMap.put("ORACLE", "JAVA");
		hMap.put("GOOGLE", "GoLang");
		System.out.println(hMap);

	}

}
