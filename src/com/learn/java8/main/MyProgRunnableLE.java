package com.learn.java8.main;

public class MyProgRunnableLE {

	public static void main(String[] args) {
		Runnable run = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		};

		Thread thr1 = new Thread(run);
		thr1.start();

		// Main Thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
