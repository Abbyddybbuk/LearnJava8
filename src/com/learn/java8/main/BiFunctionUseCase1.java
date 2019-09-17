package com.learn.java8.main;

import java.util.Scanner;
import java.util.function.BiFunction;

public class BiFunctionUseCase1 {

	public static void main(String[] args) {
		// It always accepts two input values but will return a value which can be of any type
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		Integer var1 = scanner.nextInt();
		
		System.out.println("Enter Second Number");
		Integer var2 = scanner.nextInt();
		
		BiFunction<Integer, Integer, Integer> biFunc = (val1, val2) -> { return val1 * val2; };
		
		System.out.println("Multiplication of two numbers is: " + biFunc.apply(var1, var2));

	}

}
