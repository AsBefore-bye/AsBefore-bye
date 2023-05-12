package com.example.DesignPatterns;

public class Singleton1 {
    private static final Singleton1 instance = new Singleton1();

    private Singleton1(){}

    public  static  Singleton1 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton1.getInstance().hashCode());
            } ).start();
        }
    }
}
