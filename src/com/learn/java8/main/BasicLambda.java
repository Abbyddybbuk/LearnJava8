package com.learn.java8.main;

import java.util.Locale;
import java.util.UUID;

public class BasicLambda {
	public static void main(String[] args) {
//   What is a Lambda Function: No Access Modifier, No Return Type, No Method Name
// * if a method contains single line then curly braces can be removed()->Sopn("Hello");
// * Return statement can be removed and if only one import parameter then brackets can be removed from importing e.g. s->s.length(); 
// * Return type of import parameters can be removed (Type Inference)	(a, b) -> Sopln(a + b);	

//	Functional Interface: If the interface contains only one abstract method. It can have any number of default and static method
//  @FunctionalInterface annotation is used to inform compiler to treat interface as Functional Interface
//	In case of Inheritance in Functional Interface, if the child method does not contain any method but parent contains. It is possible
//	In case child contains exactly the same method as parent with same name. It is possible
//	Child Interface cannot define its own abstract method	

//      How to call Lambda Function
//		Using Polymorphism Concept declare Interface Variable and implement the interface
		DemoFunctionalInterf demoFi = () -> System.out.println("Call to basicLambdaCallDemo");
//		Call the implementation above
		demoFi.basicLambdaCallDemo();
		
		DemoFunctionalInterf demoFi1 = () -> System.out.println("Call to basicLambdaCallDemo 222");
		demoFi1.basicLambdaCallDemo();
		
//      Here the implementation of interface DemoFunctionalInterfAdd does not require type to be 
//		declared for importing parameters; compiler take the reference from interface for Type declaration
		DemoFunctionalInterfAdd demoFiAdd = (a, b) -> System.out.println("The sum is: " + (a + b));
		demoFiAdd.basicAddition(10, 20);
		demoFiAdd.basicAddition(100, 200);
		
//		Implementation of interface does not require paranthesis in importing parameter, also return 
//		type is not required
		DemoFunctionalInterfStringLength demoFiStrlen = s -> s.length();
		System.out.println("String length is: " + demoFiStrlen.getLength("Abhijeet Kulshreshtha")); 
		
		String weekdays = "PT00H00M00S";
        weekdays = weekdays.substring(2, 4);
        System.out.println("Test " + weekdays);
        
        DemoMultipl multiplication = (a, b) -> a * b;
        System.out.println(multiplication.multiply(2, 3));
        
        DemoOperations dmo = (a, b) -> (a + b);
        System.out.println(dmo.add(56, 3));
        
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        
        String langu = "en_GB";
        Locale forLangLocale = Locale.forLanguageTag(langu);
        System.out.println(Locale.ENGLISH);
	}
}

@FunctionalInterface
interface DemoFunctionalInterf {
	public void basicLambdaCallDemo();
}

@FunctionalInterface
interface DemoFunctionalInterfAdd {
	public void basicAddition(int a, int b);
}

@FunctionalInterface
interface DemoFunctionalInterfStringLength {
	public int getLength(String s);
}

@FunctionalInterface
interface DemoMultipl {
	public int multiply(int a, int b);
}

@FunctionalInterface
interface DemoOperations{
	public int add(int a, int b);
}