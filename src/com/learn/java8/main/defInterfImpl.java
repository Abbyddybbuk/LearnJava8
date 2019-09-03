package com.learn.java8.main;

public class defInterfImpl implements defInterf {

	public static void main(String[] args) {
	   defInterfImpl impl = new defInterfImpl();	
       System.out.println("Calculation of two numbers is: " + impl.calc(22, 33));
	}
    
	public Integer calc(Integer var1, Integer var2) {
		return var1 * var2;
	}
}

// Default Methods: they can be overridden in implementation class
interface defInterf {
	default Integer calc(Integer var1, Integer var2) {
		return var1 + var2;
	}
}
