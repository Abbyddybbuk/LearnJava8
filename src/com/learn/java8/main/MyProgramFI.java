package com.learn.java8.main;

public class MyProgramFI {

	public static void main(String[] args) {
		myInterface myIntf = (a, b) -> a + b;
		
		System.out.println("The addition is: " + myIntf.addnum(23, 46));

	}

}

@FunctionalInterface
interface myInterface {
	public Integer addnum(Integer a, Integer b);
}
