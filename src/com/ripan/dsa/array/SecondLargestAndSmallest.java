package com.ripan.dsa.array;

public class SecondLargestAndSmallest {

    public static int getSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;

        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i ++){
            if(arr[i] > large){
                secLarge = large;
                large = arr[i];
            } else if(arr[i] != large && arr[i] > secLarge){
                secLarge = arr[i];
            }
        }
        // check whether the second large element is equal to the Integer.MIN_VALUE or not.
        // In this case we need to return -1.
        return (secLarge == Integer.MIN_VALUE) ? -1 : secLarge ;
    }

    public static int getSecondSmallest(int[] arr){
        if(arr.length < 2) return -1;

        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i ++){
            if(arr[i] < small){
                secSmall = small;
                small = arr[i];
            } else if(arr[i] != small && arr[i] < secSmall){
                secSmall = arr[i];
            }
        }
        return (secSmall == Integer.MAX_VALUE) ? -1 : secSmall;
    }

    public static void main(String[] args) {
        int[] arr = {12, 2, 24, 3, 295, 342, 34 };

        int secondSmallest = getSecondSmallest(arr);
        int secondLargest =getSecondLargest(arr);

        System.out.println(secondSmallest);
        System.out.println(secondLargest);
    }
}
