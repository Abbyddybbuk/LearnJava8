package com.learn.java8.main;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class BiPredicateUseCase1 {

	public static void main(String[] args) {
		// It always accepts two input values but will always return one boolean value
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		Integer var1 = scanner.nextInt();
		
		System.out.println("Enter Second Number");
		Integer var2 = scanner.nextInt();
		
		BiPredicate<Integer, Integer> biPred = (val1, val2) -> (val1 + val2) % 2 == 0;
		
		System.out.println(biPred.test(var1, var2));

	}

}
