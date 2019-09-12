package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierUseCase2 {

	public static void main(String[] args) {
		Supplier<String> suplr = () -> {
			List<String> nameList = new ArrayList<String>();
			nameList.add("Abhijeet");
			nameList.add("Ashish");
			nameList.add("Ankur");
			nameList.add("Modi");

			int idx = (int) (Math.random() * 4);
			return nameList.get(idx);
		};
		
		System.out.println(suplr.get());

	}

}
