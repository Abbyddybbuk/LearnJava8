package com.learn.java8.main;

public class MethodRefExample {
    
	public static void main(String[] args) {
		// Method Reference Example: Here both refer and referring method should have same argument types
		myMethodRef myRefTest = MethodRefExample::m2;
		myRefTest.m1();

	}
	
	public static void m2() {
		System.out.println("Hello World");
	}

}

@FunctionalInterface
interface myMethodRef {
	public void m1();
}
