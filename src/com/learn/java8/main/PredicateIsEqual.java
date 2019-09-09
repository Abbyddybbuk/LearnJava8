package com.learn.java8.main;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateIsEqual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();

		Predicate<String> isAbhi = Predicate.isEqual("Abhijeet");

		if (isAbhi.test(name)) {
			System.out.println("You are allowed inside");
		} else {
			System.out.println("You are not allowed inside");
		}
	}

}
