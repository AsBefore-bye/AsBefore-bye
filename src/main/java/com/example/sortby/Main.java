package com.example.sortby;

import java.util.Arrays;

import static com.example.sortby.QuickSort.quickSort;

public class Main {
    public static void main(String[] args) {
        int arr[] = {15,3,28,37,2,17,49,87,12,9,56};
//      冒泡排序
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//      插入排序
//        insertionsort(arr);
//        System.out.println(Arrays.toString(arr));
//      快速排序
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}