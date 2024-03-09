package com.learn.java8.main;

import java.util.*;

public class MyLearning {
    public static void main(String[] args) {
        TryFunctionalMethods tFm = (a, b) -> a + b;
        System.out.println("The total is: " + tFm.addition(98, 78));
        tFm.showMessage();


        List<String> testList = new ArrayList<>();
        testList.add("ABHI");
        testList.add("ANKUR");
        testList.add("Kulshreshtha");
        Integer abc=testList.indexOf("ANKURUH");
        System.out.println(abc);
        Iterator<String> itr = testList.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        Set<String> sSet = new HashSet<>();

    }
}

@FunctionalInterface
interface TryFunctionalMethods {
    public Integer addition(Integer a, Integer b);

    default void showMessage() { System.out.println("Default Show Method Executed"); };
}
