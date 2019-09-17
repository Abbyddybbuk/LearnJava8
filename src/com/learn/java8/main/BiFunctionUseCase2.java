package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionUseCase2 {

	public static void main(String[] args) {
		BiFunction<String, Integer, StudentRepo> biFunc = (name, marks) -> {
			return new StudentRepo(name, marks);
		};
        
		List<StudentRepo> stdList = new ArrayList<StudentRepo>();
		stdList.add(biFunc.apply("Abhijeet", 99));
		stdList.add(biFunc.apply("Sumit", 88));
		stdList.add(biFunc.apply("Suresh", 77));
		stdList.add(biFunc.apply("Suyash", 66));
		stdList.add(biFunc.apply("Tejas", 55));
		stdList.add(biFunc.apply("Bhola", 44));
		stdList.add(biFunc.apply("Akash", 33));
		
		
		for (StudentRepo stdRepo: stdList) {
			System.out.println(stdRepo.getName() + " " + stdRepo.getMarks());
		}
	}

}
