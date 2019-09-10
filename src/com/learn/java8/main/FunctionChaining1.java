package com.learn.java8.main;

import java.util.function.Function;

public class FunctionChaining1 {

	public static void main(String[] args) {
		Function<String, String> f1 = str->str.toUpperCase();
		Function<String, String> f2 = str->str.substring(0, 10);
		
		System.out.println(f1.andThen(f2).apply("abhijeet kulshreshtha"));

	}

}
