package com.example.thread;

import java.util.concurrent.CountDownLatch;

//计数器
public class demo02 {

    public static void main(String[] args) throws InterruptedException {
        //相当于计数器
        CountDownLatch countDownLatch = new CountDownLatch(5);
        Thread[] threads = new Thread[5];
        /* 计数器总数是5,当减少为0,任务才继续向下执行 */
        for (int i = 0; i <threads.length; i++) {
            threads[i] = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "==>start");
            });
            countDownLatch.countDown();
        }
        //按照顺序执行线程
        for (int i = 0; i < 5; i++) {
            threads[i].start();
            threads[i].join(); //等待线程执行结束
        }
            countDownLatch.await();
            System.out.println("main线程继续向下执行");
        }
    }
