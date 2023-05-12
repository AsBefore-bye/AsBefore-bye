package com.example.DesignPatterns;

public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static  Singleton3 getInstance() {
        if (instance == null) {
            synchronized(Singleton3.class){
                if(instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton3.getInstance().hashCode());
            }).start();
        }
    }
}
