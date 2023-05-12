package com.example.DesignPatterns;

public class Singleton {
     private Singleton(){
 }
     private  static volatile Singleton instance;

     public static Singleton getInstance(){
          if(instance == null) synchronized (Singleton.class) {
               if (instance == null) {
                    instance = new Singleton();
               }
          }
          return instance;
     }

     public static void main(String[] args) {
          for (int i = 0; i < 100; i++) {
              new Thread(() -> {
                   System.out.println(Singleton.getInstance().hashCode());
              } ).start();
          }
     }
}
