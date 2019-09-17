package com.learn.java8.main;

import java.util.function.Supplier;
import java.sql.Timestamp;
import java.util.Random;

public class SupplierUseCase4 {

	public static void main(String[] args) {
		Supplier<String> suplr = ()-> {
			String saltChars = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			Timestamp tStamp = new Timestamp(System.currentTimeMillis());
			String strTstamp = String.valueOf(tStamp.getTime());

			saltChars = saltChars.concat(strTstamp);
			StringBuilder salt = new StringBuilder();

			Random rnd = new Random();

			while (salt.length() < 10) {
				int index = (int) (rnd.nextFloat() * saltChars.length());
				salt.append(saltChars.charAt(index));
			}
			return salt.toString();			
		};
		
		System.out.println(suplr.get());

	}

}
