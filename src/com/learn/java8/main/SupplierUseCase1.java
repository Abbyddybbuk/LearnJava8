package com.learn.java8.main;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierUseCase1 {

	public static void main(String[] args) {
		// Supplier is an interface which contains only one abstract method get() which does not have any importing
		// parameter but always returns a value
		Supplier<Date> suplr = () -> new Date();
		
		System.out.println(suplr.get());

	}

}
