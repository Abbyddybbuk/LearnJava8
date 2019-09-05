package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateUseCase {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
        numList.add(0);
        numList.add(5);
        numList.add(10);
        numList.add(15);
        numList.add(20);
        numList.add(25);
        numList.add(30);
        
        Predicate<Integer> pred1 = val1 -> val1>10;
        Predicate<Integer> pred2 = val1 -> val1%2 == 0;
        
        // Call method to check numbers >10
        checkCond(pred1, numList);
        System.out.println("******************************");
        
        // Get me numbers less than 10
        checkCond(pred1.negate(), numList);        
        System.out.println("******************************");
        
        // Check both predicates if they are true
        checkCond(pred1.and(pred2), numList);        
        System.out.println("******************************");
        
        // Check both predicates if they are true
        checkCond(pred1.or(pred2), numList);        
	}
	
	public static void checkCond(Predicate<Integer> pred, List<Integer> numList) {
		for(Integer num: numList) {
			if (pred.test(num))
				System.out.println(num);
		}
	}

}
