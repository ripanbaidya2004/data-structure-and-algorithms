package com.ripan.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

    private static void bubbleSort(int[] arr) {
        int len = arr.length;

        for(int i = len-1; i >= 1 ; i --){
            for(int j = 0 ; j <= len - 2 ; j ++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {21, 23, 2, 6, 3, 19, 5};

        System.out.println("Before Sorting :"+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting :"+ Arrays.toString(arr));
    }


}
