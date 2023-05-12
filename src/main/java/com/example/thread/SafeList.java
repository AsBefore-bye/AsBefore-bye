package com.example.thread;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SafeList {
    public static void main(String[] args) {
        List<Object> list = Collections.synchronizedList(new ArrayList<>());
        List<String> list1 = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                list1.add(UUID.randomUUID().toString());
                System.out.println(list1);
            }, "线程" + i).start();
        }
    }
}
