package com.learn.java8.main;

import java.util.function.BinaryOperator;

public class BinaryOpUseCase1 {

	public static void main(String[] args) {
		// BinaryOperator interface is the child interface of BiFunction interface and used in case
		// both the importing parameters and one return parameter have same type
		BinaryOperator<String> bConc = (str1, str2) -> str1 + str2;
		
		System.out.println("Concatenated Name: " + bConc.apply("Abhijeet", " Kulshreshtha"));

	}

}
