package com.example.thread;


public class MyRunnable  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            final String name = Thread.currentThread().getName();
            System.out.println(name + " 执行了：HelloWOrld==>"+i);
        }

        try {
            System.out.println(Thread.currentThread().getName()+"---睡眠了");
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
