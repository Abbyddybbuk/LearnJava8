package com.learn.java8.main;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String> op1 = Optional.empty();
		System.out.println(op1);
		
		Optional<String> op2 = Optional.of("Abhi");
		System.out.println(op2.get());
		
		Optional<String> op3 = Optional.ofNullable("A");
		System.out.println(op3.get());
		
		String temp = op3.get();
		System.out.println(temp);
	}

}
