package com.learn.java8.main;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class BiConsumerUseCase1 {

	public static void main(String[] args) {
		// It always accepts two input values but will not return anything
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String");
		String var1 = scanner.next();
		
		System.out.println("Enter Second String");
		String var2 = scanner.next();
		
		BiConsumer<String, String> biCons = (val1, val2) -> { System.out.println(val1.concat(" ").concat(val2)); };
		
		biCons.accept(var1, var2);

	}

}
