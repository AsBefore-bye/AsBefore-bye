package com.example.thread;

import java.util.*;

public class NotSafeList {
    /**
     * 多个线程同时对集合进行修改
     */
    public static void main(String[] args) {
        List<Object> list =  new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString());
                System.out.println(list);
            }, "线程" + i).start();
        }
    }
}
