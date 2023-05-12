package com.example.sortby;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j + 1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }
}
