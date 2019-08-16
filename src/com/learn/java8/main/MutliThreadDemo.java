package com.learn.java8.main;

public class MutliThreadDemo {

	public static void main(String[] args) {
//  For multi-threading concept to be implemented, you need to implement Runnable interface (run method) 
//	and instantiate Thread object by passing runtime object of Runnable Interface
		Runnable run1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		};

		Thread thread1 = new Thread(run1);
		thread1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
