package com.learn.java8.main;

public class MyProgRunnableAC1 {
	int x = 100;

	public static void main(String[] args) {
		interfTest interf1 = new interfTest() {
			int x = 50;

			@Override
			public void display() {
				// this x always refers to inner class instance variable
				System.out.println(this.x);

			}
		};

		interf1.display();
		
		MyProgRunnableAC1 myProg = new MyProgRunnableAC1();
//		this x refers to main class instance variable
		System.out.println(myProg.x);

	}

}

interface interfTest {
	public void display();
}