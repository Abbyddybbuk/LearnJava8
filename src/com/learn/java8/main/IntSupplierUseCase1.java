package com.learn.java8.main;

import java.util.function.IntSupplier;

public class IntSupplierUseCase1 {

	public static void main(String[] args) {
		IntSupplier intOtpCalc = () -> (int) (Math.random() * 10);
        
		String otp = "";
		
		for (int i=0; i < 6; i++) {
			otp = otp + intOtpCalc.getAsInt();
		}
		
		System.out.println("Generated OTP will be active for 10 mins: " + otp);
	}

}
