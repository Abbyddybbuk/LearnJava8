package com.learn.java8.main;

import java.util.function.ObjDoubleConsumer;

public class ObjDoubConsumerUseCase1 {
    // ObjDoubleConsumer Interface will always accept one Object type and will return primitive
	// double type
	public static void main(String[] args) {
		ObjDoubleConsumer<EmployeeSalary> eSalCalc = (emp, salary) -> System.out.println(emp.getSalary() + salary);
        EmployeeSalary empSalRec = new EmployeeSalary("Abhijeet", 80000.00);
        
        eSalCalc.accept(empSalRec, 70000.00);
	}

}
