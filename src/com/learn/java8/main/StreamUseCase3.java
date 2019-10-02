package com.learn.java8.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamUseCase3 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(0);
		numList.add(5);
		numList.add(10);
		numList.add(20);
		numList.add(15);
		numList.add(25);
		
		Integer[] numArray = numList.stream().toArray(Integer[]::new);
		for(Integer num: numArray) {
			System.out.println(num);
		}
		
		// Stream concept can be applied on any group of values using method Stream.of()
		Stream<Integer> sNums = Stream.of(1,2,3,4,5,6,7,8,9,0);
		sNums.forEach(System.out::println);

		// Stream concept can be applied on any Arrays as well using method Stream.of()
		Double[] doubNums = {10.0, 20.98, 30.89, 70.65, 66.29, 89.67};
		Stream<Double> sDoubNums = Stream.of(doubNums);		
		sDoubNums.forEach(System.out::println);
	}

}
