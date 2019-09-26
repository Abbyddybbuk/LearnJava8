package com.learn.java8.main;

import java.util.function.IntConsumer;

public class IntConsumerUseCase1 {

	public static void main(String[] args) {
	   IntConsumer intCalcSquare = i -> System.out.println("Square root is: " + i*i);
       intCalcSquare.accept(7);
	}

}
