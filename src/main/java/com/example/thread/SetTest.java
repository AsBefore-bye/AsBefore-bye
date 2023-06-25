package com.example.thread;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * 同理可证
 */
public class SetTest {

    public static  void main(String[] args) {

//        Set<String> set = new HashSet<>();
        //如何解决hashSet线程安全问题
        Set<String> set = Collections.synchronizedSet(new HashSet<>());
//        Set<String> set = new CopyOnWriteArraySet<>();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                synchronized (set){
                set.add(UUID.randomUUID().toString().substring(0, 5));
                System.out.println(set);}
            }, String.valueOf(i)).start();
        }
    }
}


