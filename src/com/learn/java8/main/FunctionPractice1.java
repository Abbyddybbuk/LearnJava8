package com.learn.java8.main;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type any String ...I will tell you its length");
		String anyString = sc.next();
		
		Function<String, Integer> fLengthCheck = text -> text.length();
		Integer length =fLengthCheck.apply(anyString);
		
		System.out.println("Length is... " + length);

	}

}
