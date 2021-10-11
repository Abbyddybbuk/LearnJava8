package com.learn.java8.main;

import java.time.LocalDate;
import java.time.Month;

public class DatePlay {

	public static final String jan = "JAN";
	public static final String feb = "FEB";
	public static final String mar = "MAR";
	public static final String apr = "APR";
	public static final String may = "MAY";
	public static final String jun = "JUN";
	public static final String jul = "JUL";
	public static final String aug = "AUG";
	public static final String sep = "SEP";
	public static final String oct = "OCT";
	public static final String nov = "NOV";
	public static final String dec = "DEC";

	public static void main(String[] args) {
		String periodicityStartMonth = "JUL";
		String periodicityEndMonth = "MAR";
		String periodicityStartDay = "1";
		String periodicityEndDay = "31";

		LocalDate date = LocalDate.now();
		System.out.println(Integer.toString(date.getYear()));

		String startDay = periodicityStartDay + "-" + periodicityStartMonth + "-" + Integer.toString(date.getYear());
		System.out.println(startDay);

		Month month = Month.of(1);
		System.out.println(month.toString());
		LocalDate sDate = LocalDate.of(date.getYear(), calcMonth(periodicityStartMonth), Integer.parseInt(periodicityStartDay));
		System.out.println("Start Date: " + sDate);
		LocalDate eDate = LocalDate.of(date.getYear(), calcMonth(periodicityEndMonth), Integer.parseInt(periodicityEndDay));
		
		
		if (sDate.compareTo(eDate) > 0) {
			eDate = eDate.plusYears(1);
		}
		System.out.println("End Date: "+ eDate);
	}

	public static Integer calcMonth(String month) {
		switch (month) {
		case DatePlay.jan:
			return 1;
		case DatePlay.feb:
			return 2;
		case DatePlay.mar:
			return 3;
		case DatePlay.apr:
			return 4;
		case DatePlay.may:
			return 5;
		case DatePlay.jun:
			return 6;
		case DatePlay.jul:
			return 7;
		case DatePlay.aug:
			return 8;
		case DatePlay.sep:
			return 9;
		case DatePlay.oct:
			return 10;
		case DatePlay.nov:
			return 11;
		case DatePlay.dec:
			return 12;
		default:
			return 0;
		}
	}
}
