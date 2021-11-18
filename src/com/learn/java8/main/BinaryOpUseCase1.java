package com.learn.java8.main;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOpUseCase1 {

	public static void main(String[] args) {
		// BinaryOperator interface is the child interface of BiFunction interface and used in case
		// both the importing parameters and one return parameter have same type
		BinaryOperator<String> bConc = (str1, str2) -> str1 + str2;
		
		System.out.println("Concatenated Name: " + bConc.apply("Abhijeet", " Kulshreshtha"));
		
		// IntBinaryOperator interface is the primitive version of Binary Operator
		// LongBinaryOperator interface for long values
		// DoubleBinaryOperator interfaces for Double Values
		IntBinaryOperator inBin = (val1, val2) -> val1 + val2;		
		System.out.println("Sum is: " + inBin.applyAsInt(20, 30));
        
		String abc = "EFG";
		String abc1 = new String("EFG");
        
		if (abc==abc1) {
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}
 	}

}
