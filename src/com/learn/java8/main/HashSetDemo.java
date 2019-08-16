package com.learn.java8.main;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
//      HashSet: The order of elements is not maintained but duplicates cannot be saved		
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("Abhi");
		hSet.add("Kulshreshtha");
		hSet.add("Kanu");
		hSet.add("Saxena");
		hSet.add("Abhi");
        System.out.println(hSet);
	}

}
