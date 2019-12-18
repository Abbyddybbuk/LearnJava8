package com.learn.java8.main;

public class DoubleColonP1 {

	public static void main(String[] args) {
		MyTestInterf myName = DoubleColonP1::callName;
		String name = myName.callMyName();
		
		System.out.println(name);
		
		

	}
	
	
	public static String callName() {
		return "Abhijeet Kulshreshtha";
	}

}

@FunctionalInterface
interface MyTestInterf {
	public String callMyName();
}
