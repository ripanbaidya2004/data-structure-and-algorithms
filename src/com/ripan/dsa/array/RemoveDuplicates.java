package com.ripan.dsa.array;
// remove duplicates and return the number of unique elements.
// leetcode 26

public class RemoveDuplicates {

    private static int removeDuplicated(int[] arr){
       int i = 0 ;
       for(int j = 1 ; j <= arr.length-1 ; j ++){
           if(arr[i] != arr[j]){
               arr[i+1] = arr[j];
               i ++;
           }
       }
       // time: O(n), space: O(1)
       return (i+1);
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 2, 3, 3, 3, 5};

        System.out.println(removeDuplicated(arr));
    }
}
