package com.example.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutDemo {
    public static void main(String[] args) {
        try (FileOutputStream outputStream = new FileOutputStream("output.txt",true)) {
            outputStream.write("linxi".getBytes());
            outputStream.flush();
        }
        catch(IOException e){
                e.printStackTrace();
            }
        }
    }
