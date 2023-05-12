package com.example.thread;

class Ticket {
    private int number = 100;
    public synchronized void sale() {
        if (number > 0) {
            System.out.println(Thread.currentThread().getName() + " : 卖出前：" + (number--) + " 卖出后：" + number);
        }
    }
}

public class MainThread {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                ticket.sale();
            }
        }, "AA").start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                ticket.sale();
            }
        }, "BB").start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                ticket.sale();
            }
        }, "CC").start();
    }
}