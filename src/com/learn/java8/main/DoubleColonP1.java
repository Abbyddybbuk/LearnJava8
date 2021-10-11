package com.learn.java8.main;

public class DoubleColonP1 {

	public static void main(String[] args) {
		MyTestInterf myName = DoubleColonP1::callName;
		String name = myName.callMyName();
		
		System.out.println(name);
		
		// With Lambda Function
		MyTestInterf22 myName1 = str -> str.concat("Kulshreshtha");
		
		String names = myName1.callMyName("Abhijeet ");
		
		System.out.println(names);
		
		// With double colon operator
		MyTestInterf22 myName2 = DoubleColonP1::callMyUpdatedName;
		String name1 = myName2.callMyName("Abhijeet ");
		System.out.println(name1);

	}
	
	
	public static String callName() {
		return "Abhijeet Kulshreshtha";
	}
	
	public static String callMyUpdatedName(String name) {
		return name.concat("Kulshreshtha");
	}

}

@FunctionalInterface
interface MyTestInterf {
	public String callMyName();
}

@FunctionalInterface
interface MyTestInterf22 {
	public String callMyName(String name);
}