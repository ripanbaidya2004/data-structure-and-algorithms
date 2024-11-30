package com.ripan.dsa.array;

import java.util.Arrays;

// move all the zeros to the end of the array
// leetcode 283

public class MoveZerosToEnd {

    private static void moveZerosBetterSolution(int[] arr){
        int trackZero = -1;
        for(int i = 0 ;i <= arr.length-1 ; i ++){
            if(arr[i] == 0){
                trackZero = i ;
                break;
            }
        } // O(x)

        for(int j = trackZero+1 ; j <= arr.length-1; j ++){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[trackZero];
                arr[trackZero] = temp;
                trackZero ++;
            }
        }// O(n - x)

        // time : O(x) + O(n-x) ==> O(n), space = O(1)
    }

    public static void main(String[] args) {

        int[] arr = {7, 1, 0, 3, 0, 0, 2}; // 7, 1, 3, 2, 0, 0, 0

        System.out.println("Original Array :"+ Arrays.toString(arr));
        moveZerosBetterSolution(arr);
        System.out.println("After moving zeros :"+ Arrays.toString(arr));
    }
}
