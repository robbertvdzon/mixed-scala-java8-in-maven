package com.xflin.msjm;

import java.util.stream.IntStream;

public class JavaMain {
    public static void main(String[] args) {
        System.out.println("JavaMain starts");
        IntStream.of(1, 2, 3).forEach(i-> System.out.println(i)); // test java8 code
        new ScalaService().hello();
        System.out.println("JavaMain ends");
    }
}
