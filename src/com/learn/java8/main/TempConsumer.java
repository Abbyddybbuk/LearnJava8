package com.learn.java8.main;

import java.util.function.Consumer;

public class TempConsumer {
//  Consumer<Integer> cons 
	private Integer calcAge=0;
	
	public Integer calculateAgeTax(Integer personAge) {
		Consumer<Integer> cons = (age) -> {
			age = age + 10;
			this.calcAge = age;
		};
		
		cons.accept(personAge);
		return calcAge;
	}
}
