package com.learn.java8.main;

import java.util.function.IntFunction;

public class TempCalc {
  private Integer calcAge=0;
  
  public Integer calculateAgeTax(Integer factor) {
	  IntFunction<Integer> ageDemo = (age) -> {
		calcAge = age + 10;  
		Integer temp = calcAge;
		return temp;
	  };
	  
	  ageDemo.apply(factor);
	  
	  return calcAge;
  }
}
