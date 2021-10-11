package com.learn.java8.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReportConfigDemo {
	public static String featureToggle = "CAT2";

	public static void main(String[] args) {
//		List<String> existingValuesInDb = new ArrayList<>();
//		String valdb1 = "MYR";
//		existingValuesInDb.add(valdb1);
//		String valdb2 = "ABC";
//		existingValuesInDb.add(valdb2);
//		System.out.println(existingValuesInDb);
//		List<String> existingValues = new ArrayList<>();
//		String val1 = "ABC";
//		existingValues.add(val1);
//		System.out.println(existingValues);
//		
//        List<String> deletedValues = existingValuesInDb.stream()
//                .filter(element -> !existingValues.contains(element)).collect(Collectors.toList());	  
//        System.out.println(deletedValues);
		List<ReportCategory> reportList = new ArrayList<>();
		ReportCategory rp1 = new ReportCategory();
		rp1.setCountry("DE");
		rp1.setReportCat("CAT1");
		rp1.setStatus("INDEV");
		rp1.setFtName("CAT1");
		reportList.add(rp1);

		ReportCategory rp2 = new ReportCategory();
		rp2.setCountry("DE");
		rp2.setReportCat("CAT2");
		rp2.setFtName("CAT2");
		reportList.add(rp2);

		ReportCategory rp3 = new ReportCategory();
		rp3.setCountry("DE");
		rp3.setReportCat("CAT3");
		rp3.setFtName("CAT3");
		reportList.add(rp3);

		ReportCategory rp4 = new ReportCategory();
		rp4.setCountry("DE");
		rp4.setReportCat("CAT4");
		rp4.setFtName("");
		reportList.add(rp4);

		ReportCategory rp5 = new ReportCategory();
		rp5.setCountry("DE");
		rp5.setReportCat("CAT5");
		rp5.setFtName(" ");
		reportList.add(rp5);

		ReportCategory rp6 = new ReportCategory();
		rp6.setCountry("DE");
		rp6.setReportCat("CAT6");
		rp6.setFtName(null);
		reportList.add(rp6);

		Predicate<ReportCategory> predicate1 = rp -> rp.getFtName() == null;
		Predicate<ReportCategory> predicate2 = rp -> rp.getFtName().trim().equals("");
		Predicate<ReportCategory> predicate3 = rp -> rp.getFtName().equals(featureToggle);

		reportList = reportList.stream().filter(predicate1.or(predicate2).or(predicate3)).collect(Collectors.toList());
		for (ReportCategory rp : reportList) {
			System.out.println(rp.getReportCat());
		}
	}

}
