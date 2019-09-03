package com.learn.java8.main;

public class DefStaticImplClass {

	public static void main(String[] args) {
//		With Java 1.8 version, interface can contain static methods which can be called inside any class only by interface name 
//		then the method name
		myDefInterf.defMessage();

	}

}


interface myDefInterf {
	public static void defMessage( ) {
		System.out.println("Born curious");
	}
}