package com.example.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class InputDemo {
    public static void main(String[] args) {
        try (InputStreamReader inputStream = new InputStreamReader(new FileInputStream("D:\\sortware/1.txt"), StandardCharsets.UTF_8)) {
            int tmp;
            while ((tmp = inputStream.read()) != -1) {   //通过while循环来一次性读完内容
                System.out.print((char)tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
