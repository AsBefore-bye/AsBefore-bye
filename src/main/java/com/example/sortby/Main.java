package com.example.sortby;

import java.util.Arrays;

import static com.example.sortby.InsertionSort.insertionsort;

public class Main implements Cloneable {
//    重写克隆方法
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        int arr[] = {28,74,32,16,8,12,25,57,32,9,1,29};
//      冒泡排序
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//      插入排序
        insertionsort(arr);
//        System.out.println(Arrays.toString(arr));
//      快速排序
//        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}