package com.example.thread;


import java.util.concurrent.*;

public class ThreadPoolDemo1 {

    public static void main(String[] args) {
        //1.创建线程池
        ExecutorService pool = new ThreadPoolExecutor(
                3,
                5,
                8,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        //2. 给任务线程池处理
        Runnable target = new MyRunnable();
        //核心线程
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        //下面再执行可以看到线程复用
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        //下面可以看到 创建临时线程（执行任务中加入sleep）
        pool.execute(target);
        pool.execute(target);
        // 不创建临时线程，执行配置的拒绝策略(丢弃任务并且抛出异常)
        pool.execute(target);
    }
}
