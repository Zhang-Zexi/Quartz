package com.zzx.list.demo;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i ++) {
            list.add(i);
        }
        if (list.size() <= 100) {
            System.out.println(list.subList(0, list.size()));
        } else {
            System.out.println(list.subList(0, 100));
        }

        list.stream().limit(100).forEach(e -> {
            System.out.println(e);
        });
    }
}
