package com.learn.java8.main;

public class MethodRefRunnable {

	public static void main(String[] args) {
		MethodRefRunnable mRefRun = new MethodRefRunnable();
		
		// Initialize Child Thread Via Method Reference
		Runnable runnable = mRefRun::initialize;
		Thread thread = new Thread(runnable);
		thread.start();
		
		//Main Thread
		for (int i=0; i<10; i++) {
		   System.out.println("Main Thread");	
		}

	}

	public void initialize() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}

	}
}
