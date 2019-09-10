package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionUseCase3 {

	public static void main(String[] args) {
		List<StudentRepo> studentList = new ArrayList<StudentRepo>();
		studentList.add(new StudentRepo("Abhijeet", 95));
		studentList.add(new StudentRepo("Amit", 60));
		studentList.add(new StudentRepo("Vineet", 50));
		studentList.add(new StudentRepo("Sumesh", 86));
		studentList.add(new StudentRepo("Garvit", 99));
		studentList.add(new StudentRepo("Mayank", 20));

		Predicate<StudentRepo> pCheckTopper = studRepo -> studRepo.getMarks() > 85;

		Function<StudentRepo, String> fStdCheck = stdRepo -> {

			if (stdRepo.getMarks() >= 80) {
				return stdRepo.getName() + " got " + "A[Distinction]";
			} else if (stdRepo.getMarks() >= 60 && stdRepo.getMarks() < 80) {
				return stdRepo.getName() + " got " + "B[Passed]";
			} else if (stdRepo.getMarks() >= 50 && stdRepo.getMarks() < 60) {
				return stdRepo.getName() + " got " + "C[Just Passed]";
			} else {
				return stdRepo.getName() + " failed and got " + "D [Failed]";
			}
		};

		// Check Function
		checkGrades(fStdCheck, pCheckTopper, studentList);

	}

	public static void checkGrades(Function<StudentRepo, String> fStdCheck, Predicate<StudentRepo> pCheckTopper,
			List<StudentRepo> studentList) {
		for (StudentRepo student : studentList) {
			String grade = fStdCheck.apply(student);
			System.out.println(grade);

			// Topper Info
			if (pCheckTopper.test(student)) {
				System.out.println("*********************************************************");
				System.out.println(student.getName() + " is extraordinary student");
				System.out.println("*********************************************************");
			}
		}
	}

}
