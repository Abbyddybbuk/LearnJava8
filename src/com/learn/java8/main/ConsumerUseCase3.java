package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerUseCase3 {

	public static void main(String[] args) {
		List<StudentRepo> stdList = new ArrayList<StudentRepo>();
		stdList.add(new StudentRepo("Abhijeet", 99));
		stdList.add(new StudentRepo("Ankur", 65));
		stdList.add(new StudentRepo("Shiva", 70));
		stdList.add(new StudentRepo("Tuhin", 65));
		stdList.add(new StudentRepo("Rohan", 59));

		Predicate<StudentRepo> pTopperCheck = stdRepo -> stdRepo.getMarks() > 90;

		Function<StudentRepo, String> fCheckGrades = stdRepo -> {

			if (stdRepo.getMarks() >= 90) {
				return stdRepo.getName() + " passed the exams" + " with A[Distinction]";
			} else if (stdRepo.getMarks() >= 65 && stdRepo.getMarks() < 90) {
				return stdRepo.getName() + " passed the exams" + " with B[first grade]";
			} else {
				return stdRepo.getName() + " passed the exams" + " with C[just passed]";
			}
		};

		Consumer<String> consumerPrint = str -> System.out.println(str);

		checkGrades(pTopperCheck, fCheckGrades, consumerPrint, stdList);

	}

	private static void checkGrades(Predicate<StudentRepo> pTopperCheck, Function<StudentRepo, String> fCheckGrades,
			Consumer<String> consumerPrint, List<StudentRepo> stdList) {
		for (StudentRepo stdRepo : stdList) {
			String stdInfo = fCheckGrades.apply(stdRepo);
			consumerPrint.accept(stdInfo);

			if (pTopperCheck.test(stdRepo))
				consumerPrint.accept(stdRepo.getName());
		}
	}

}