package com.learn.java8.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class JodaTimeNowTstp {

	public static void main(String[] args) {
		// Current Date
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// Current Time
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		System.out.printf("%d-%d-%d", dd, mm, yyyy);
		System.out.println();
		int hrs = time.getHour();
		int mins = time.getMinute();
		int secs = time.getSecond();
		int nano = time.getNano();
		System.out.printf("%d:%d:%d:%d", hrs, mins, secs, nano);
		System.out.println();
		// Jodatime API to use for complete timestamp in Java 8
		LocalDateTime dTime = LocalDateTime.now();
		System.out.println(dTime);
		int dd1 = dTime.getDayOfMonth();
		int mm1 = dTime.getMonthValue();
		int yyyy1 = dTime.getYear();		
		
		System.out.printf("\n%d-%d-%d", dd1, mm1, yyyy1);
		
		int hrs1 = dTime.getHour();
		int mins1 = dTime.getMinute();
		int secs1 = dTime.getSecond();
		int nano1 = dTime.getNano();		
		System.out.printf("\n%d:%d:%d:%d", hrs1, mins1, secs1, nano1);
		System.out.println();
		
		// Custom Date
		LocalDateTime customDate = LocalDateTime.of(1985, Month.MAY, 15, 03, 15);
		System.out.println(customDate);
		System.out.println("After 7 Months: "+customDate.plusMonths(7));
		System.out.println("Before 7 Months: "+customDate.minusMonths(7));

	}

}
