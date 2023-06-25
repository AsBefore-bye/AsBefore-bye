package com.example.sortby;

public class InsertionSort {
    //插入排序:定义一个待插入的数，再定义一个待插入数的前一个数的下标，然后拿待插入数与前面的数组一一比较，最后交换。
        public static void insertionsort(int[] arr){
            for (int i = 0; i < arr.length; i++) {  //长度不减1，是因为要留多一个位置方便插入数
                //定义待插入的数
                int insertValue = arr[i];
                //找到待插入数的前一个数的下标
                int insertIndex = i-1;
                while (insertIndex >= 0 && insertValue < arr[insertIndex]) {//拿a[i]与a[i-1]的前面数组比较
                    arr[insertIndex+1] = arr[insertIndex];
                    insertIndex--;
                }
                arr[insertIndex+1] = insertValue;
            }
        }
    }
