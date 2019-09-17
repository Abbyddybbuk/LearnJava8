package com.learn.java8.main;

import java.util.function.Supplier;

public class SupplierUseCase3 {

	public static void main(String[] args) {
		Supplier<String> suplr = () -> {
			int i = 0;
			String otp=new String();
			while (i <= 5) {
				Integer idx = (int) (Math.random() * 10);
				otp=otp.concat(Integer.toString(idx));
				i++;
			}
			
			return otp;
		};
		
		System.out.println(suplr.get());

	}

}
