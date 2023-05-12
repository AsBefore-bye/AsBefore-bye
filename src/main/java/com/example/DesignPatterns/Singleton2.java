package com.example.DesignPatterns;

public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {

            instance = new Singleton2();
        }
        return instance;
    }

    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton2.getInstance().hashCode());
            }).start();
        }
    }
}
