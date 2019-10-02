package com.learn.java8.main;

import java.time.LocalDate;
import java.time.LocalTime;

public class JodaTimeNowTstp {

	public static void main(String[] args) {
		// Current Date
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// Current Time
		LocalTime time = LocalTime.now();
		System.out.println(time);

	}

}
