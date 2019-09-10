package com.learn.java8.main;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionUseCase2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		String inputString = "Jenny Sumo ABC Labs Brazil";
		System.out.println("Entered String " + inputString);
		// Remove White-spaces
		Function<String, String> fSpaceRemoved = str->str.replace(" ", "");
		
		System.out.println(fSpaceRemoved.apply(inputString));

	}

}
