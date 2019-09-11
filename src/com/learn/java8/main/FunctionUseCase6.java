package com.learn.java8.main;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionUseCase6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username:");
		String userName = sc.next();

		System.out.println("Enter Password:");
		String password = sc.next();

		Function<String, String> f1 = str -> str.substring(0, 5);
		Function<String, String> f2 = str -> str.toLowerCase();

		Predicate<String> pCheck = str -> str.equals("java8");

		if (f1.andThen(f2).apply(userName).equals("abhij") && pCheck.test(password)) {
			System.out.println("Correct Username and Password");
		} else {
			System.out.println("Login could not be identified");
		}

	}

}
