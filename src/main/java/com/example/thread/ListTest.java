package com.example.thread;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
//java.util.ConcurrentModificationException 并发修改异常!

public class ListTest {
    public static void main(String[] args) {
        //并发下 arrayList 是不安全的
        /**
         * 解决方案
         * 1. 使用vector解决
         * 2. List<String> arrayList = Collections.synchronizedList(new ArrayList<>());
         * 3. List<String> arrayList = new CopyOnWriteArrayList<>();
         */
        //copyOnWrite 写入时复制  COW 计算机程序设计领域的一种优化策略
        //多个线程调用的时候, list, 读取的时候固定的,写入的时候,可能会覆盖
        //在写入的时候避免覆盖造成数据问题
        //CopyOnWriteArrayList 比 vector牛逼在哪里

        //读写分离
        List<String> arrayList = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                synchronized (arrayList){
                arrayList.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(arrayList);}
            },String.valueOf(i)).start();
        }
    }
}



