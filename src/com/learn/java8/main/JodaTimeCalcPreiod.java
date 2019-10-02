package com.learn.java8.main;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class JodaTimeCalcPreiod {

	public static void main(String[] args) {
		//Calculate Age
		LocalDate birthday = LocalDate.of(1985, 05, 15);
		LocalDate today = LocalDate.now();

		Period period = Period.between(birthday, today);
		System.out.printf("Your age is %d years %d months and %d days", period.getYears(), period.getMonths(),
				period.getDays());
        
		
		// Calculate Days
		LocalDate endDay = LocalDate.of(1985+60, 05, 15);
		Period period1 = Period.between(today, endDay);
		int daysLeft = period1.getYears()*365 + period1.getMonths()*30 + period1.getDays();
		System.out.println();
		System.out.printf("Only %d days left", daysLeft);
		
		// Check Leap Year
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Year");

		int inputYear = input.nextInt();
		Year y = Year.of(inputYear);

		if (y.isLeap()) {
			System.out.printf("Year %d is a leap year", inputYear);
		} else {
			System.out.printf("Year %d is not a leap year", inputYear);
		}
	}

}
