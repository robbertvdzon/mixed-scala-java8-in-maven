package com.xflin.msjm;

import java.util.ArrayList;
import java.util.List;

public class JavaMain {
    public static void main(String[] args) {
        System.out.println("JavaMain starts");
        List<String> list = new ArrayList<>();
        list.add("bla1");
        list.add("bla2");
        list.stream().forEach(s-> System.out.println(s));
        new ScalaService().hello();
        System.out.println("JavaMain ends");
    }
}
