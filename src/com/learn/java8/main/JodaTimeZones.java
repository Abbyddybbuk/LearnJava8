package com.learn.java8.main;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaTimeZones {

	public static void main(String[] args) {
		// Current TimeZone of system
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("My Time Zone is: " + zone);
		
		// Calculate Time in America/Los_Angeles
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(la);
		System.out.println(dt);

	}

}
