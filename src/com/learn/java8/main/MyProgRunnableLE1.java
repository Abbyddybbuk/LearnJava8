package com.learn.java8.main;

public class MyProgRunnableLE1 {
    int x = 100;
	public static void main(String[] args) {
      
		myInterface11 my1 = ()-> {
			int x = 50;
			System.out.println("Implementation Display " + x);
			
		};
		
		my1.display();
		System.out.println("Interface Main");
	}

}

@FunctionalInterface
interface myInterface11 {
	public void display();
}
