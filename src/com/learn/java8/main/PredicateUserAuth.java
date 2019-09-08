package com.learn.java8.main;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateUserAuth {

	public static void main(String[] args) {
		Predicate<User> pUserAuthCheck = user -> user.getUserName().equals("Abhijeet")
				&& user.getPassword().equals("Abhi");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username");
		String userName = sc.next();

		System.out.println("Enter Password");
		String password = sc.next();

		User user = new User(userName, password);

		if (pUserAuthCheck.test(user)) {
			System.out.println("Password Match");
		} else {
			System.out.println("Password Mismatch");
		}
	}
}
