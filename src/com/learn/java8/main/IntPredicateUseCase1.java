package com.learn.java8.main;

import java.util.function.IntPredicate;

public class IntPredicateUseCase1 {
    // IntPredicate is a primitive type functional interface
	//Type of primitive predicate interfaces
	// 1. LongPredicate
	// 2. DoublePredicate 
	public static void main(String[] args) {
		int[] valueArray = {0, 5, 10, 15, 20, 25};
		IntPredicate intPred = i -> i % 2==0;
		
		for (int val: valueArray) {
			if (intPred.test(val)) {
				System.out.println("Even Number-> " + val);
			}
				
		}

	}

}
