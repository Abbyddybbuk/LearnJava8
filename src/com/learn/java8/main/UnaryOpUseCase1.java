package com.learn.java8.main;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOpUseCase1 {
    //UnaryOperator Interface is the interface which is used in case input and return parameter
	// are of the same type
	public static void main(String[] args) {
		UnaryOperator<Integer> uCalcSquare = i -> i * i;
		
		System.out.println("Square root is: " + uCalcSquare.apply(10));
		
		//IntUnaryOperator is the interface and primitive version of UnaryOperator
		IntUnaryOperator intUCalcsq = i -> i * i;
		System.out.println("Square root is: " + intUCalcsq.applyAsInt(20));

	}

}
