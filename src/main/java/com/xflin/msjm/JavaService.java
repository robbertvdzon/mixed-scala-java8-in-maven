package com.xflin.msjm;

import java.util.ArrayList;
import java.util.List;

public class JavaService {
    public void hello() {
        System.out.println("Hello from " + JavaService.class.getName());
        List<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.stream().forEach(s-> System.out.println(s));

    }
}
