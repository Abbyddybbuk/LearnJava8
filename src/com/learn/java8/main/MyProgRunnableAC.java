package com.learn.java8.main;

public class MyProgRunnableAC {

	public static void main(String[] args) {
		Runnable run1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}

			}
		};

		Thread tr1 = new Thread(run1);
		tr1.start();
       
        //Main Thread		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}		
	}

}
