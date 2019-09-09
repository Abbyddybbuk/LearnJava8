package com.learn.java8.main;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionUseCase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String...and I will tell you its length");
		String anyString = sc.next();
		
		// Function use case
		Function<String, Integer> fLength = str->str.length();		
		Integer length = fLength.apply(anyString);
		System.out.println("The length of entered String is: " + length);		

	}

}
