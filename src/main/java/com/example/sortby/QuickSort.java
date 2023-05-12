package com.example.sortby;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {

        if (arr == null || arr.length == 0) return;
        if (low > high) return;

        int i = low;
        int j = high;
        int tmp = arr[low];
        while (i < j) {
            while (tmp >= arr[j] && i < j) {
                j--;
            }
            while (tmp <= arr[i] && i < j) {
                i++;
            }
            if (i < j) {
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[low] = arr[j];
        arr[j] = tmp;
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
        }
    }
