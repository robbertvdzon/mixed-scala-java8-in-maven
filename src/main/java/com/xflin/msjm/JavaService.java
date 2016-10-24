package com.xflin.msjm;

import java.util.stream.IntStream;

public class JavaService {
    public void hello() {
        System.out.println("Hello from " + JavaService.class.getName());
        IntStream.of(1, 2, 3).forEach(i-> System.out.println(i)); // test java8 code
    }
}
