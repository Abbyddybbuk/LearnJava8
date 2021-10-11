package com.learn.java8.main;

import java.util.function.Predicate;

// Predicate 
// 1. Introduced in 1.8 v of java
// 2. present in java.util.function
// 3. contains only test() method
// 4. interface Predicate<T> {
//        boolean test(T t) {
//      }
//    }
// 5. It is boolean valued function

public class PredicateEg1 {

	public static void main(String[] args) {
		testInterf tIntf = (Integer val1, Integer val2) -> {
			return val1 + val2;
		};
		
		System.out.println("Sum is " + tIntf.calc(100, 200));
        System.out.println("************Predicate Example**********");
        
        Predicate<Integer> pEg1 = val1->val1 > 100;
        System.out.println(pEg1.test(99));
        System.out.println(pEg1.test(101));
	}

}

@FunctionalInterface
interface testInterf {
	public Integer calc(Integer val1, Integer val2);
}
