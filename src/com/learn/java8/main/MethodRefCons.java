package com.learn.java8.main;

public class MethodRefCons {

	public static void main(String[] args) {
		// In this example, it is being shown how you can create the object of a class, since the called
		//class contains constructor which has some text being printed, it will printed on console.
		myConsRefInterf myCons = Sample::new;
		Sample sample = myCons.get();

	}

}

interface myConsRefInterf {
	public Sample get();
}
