package com.example.io;

import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo1 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("D:\\sortware/2.txt")){
            byte[] bytes = new byte[inputStream.available()];   //我们可以提前准备好合适容量的byte数组来存放
            System.out.println(inputStream.read(bytes));   //一次性读取全部内容（返回值是读取的字节数）
            System.out.println(inputStream.skip(1));
            System.out.println(new String(bytes));   //通过String(byte[])构造方法得到字符串
        }catch (IOException e){
            e.printStackTrace();
       }
    }
}


