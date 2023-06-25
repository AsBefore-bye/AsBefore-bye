package com.example;

import java.lang.reflect.Type;

public class LoaderDemo {
    public static void main(String[] args) {
        Integer i = 10;
        for (Class<?> anInterface : i.getClass().getInterfaces()) {
            System.out.println(anInterface.getName());
        }
        for (Type genericInterface : i.getClass().getGenericInterfaces()) {
            System.out.println(genericInterface.getTypeName());    }
    }
}
