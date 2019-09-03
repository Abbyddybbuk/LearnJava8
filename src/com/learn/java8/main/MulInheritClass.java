package com.learn.java8.main;

public class MulInheritClass implements leftInterf, rightInterf {

	public static void main(String[] args)  {
		MulInheritClass mulIn = new MulInheritClass();
		System.out.println("Calculation is: " + mulIn.calc(100, 900));

	}
	
//	In case of multiple inheritance, if the same method is defined in two different interfaces which
//	are being implemented by the same implementation class then system will throw a compile time error
//	stating duplicate methods. In order to overcome this issue, the inherited method has to be overridden.
//	In the overridden method, either the default implementation from one of the interface method can be called or
//	a new implementation code can be written
	public Integer calc(Integer var1, Integer var2) {
//		return var1 * var2;
		return leftInterf.super.calc(var1, var2);
	}

}

interface leftInterf {
	default Integer calc(Integer var1, Integer var2) {
		return var1 + var2;
	}
}

interface rightInterf {
	default Integer calc(Integer var1, Integer var2) {
		return var1 - var2;
	}
}
