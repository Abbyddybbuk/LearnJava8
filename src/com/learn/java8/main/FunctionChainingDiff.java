package com.learn.java8.main;

import java.util.function.Function;

public class FunctionChainingDiff {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = num->num + num;
		Function<Integer, Integer> f2 = num->num * num * num;
		
		// In this case 2 will be added with 2 using function f1 and cube will be calculated for 4 using function f2
		System.out.println(f1.andThen(f2).apply(2));
		
		// In this case f2 will be executed first, which means cube of 2 will be calculated which is 8 and then it will be 8 + 8 = 16 using f2
		System.out.println(f1.compose(f2).apply(2));

	}

}
