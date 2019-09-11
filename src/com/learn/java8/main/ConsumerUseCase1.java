package com.learn.java8.main;

import java.util.function.Consumer;

public class ConsumerUseCase1 {

	public static void main(String[] args) {
		// Consumer interface does not return anything. It contains only one abstract method which is accept()
		Consumer<String> consumer = str->System.out.println(str);
		
		consumer.accept("Abhijeet");
		consumer.accept("Kulshreshtha");

	}

}
