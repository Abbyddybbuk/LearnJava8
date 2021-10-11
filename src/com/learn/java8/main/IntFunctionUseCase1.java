package com.learn.java8.main;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class IntFunctionUseCase1 {
	
	private Integer calcValue=0;

	public static void main(String[] args) {
		// IntFunction Interface will always take primitive type as input parameter while
		// return type parameter may change and it has to be object type which means in this
		// example you cannot consider return type as primitive type int
		IntFunction<Integer> intCalc = i -> i * i;
        System.out.println(intCalc.apply(6));
        
        // ToIntFunction interface->You just have to specify return type
        ToIntFunction<String> intCalcLength = str -> str.length();
        System.out.println(intCalcLength.applyAsInt("Abhijeet Kulshreshtha"));
        
        
        // IntToDouble Function does not require any type as the input and return type
        // is already specified in Function name
        IntToDoubleFunction intDoub = i -> Math.sqrt(i);        
        System.out.println(intDoub.applyAsDouble(6));
        
//        IntFunction<Integer> calcAge = (age) -> {
//        	calcValue = age + 10;
//        	return calcValue;
//        };
        TempCalc tempCalc = new TempCalc();
        System.out.println(tempCalc.calculateAgeTax(90));
        
        
	}

}
