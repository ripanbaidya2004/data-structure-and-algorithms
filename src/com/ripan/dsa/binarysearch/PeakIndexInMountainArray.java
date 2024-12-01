package com.ripan.dsa.binarysearch;

// leetcode 852

public class PeakIndexInMountainArray {

    public int peakIndexInMountainArray(int[] arr) {
        // we will apply binary search
        int l = 0;
        int r = arr.length - 1;
        int peak = -1;

        while(l <= r){
            int mid = (l+r)/2;

            // If a mid-element is greater than its next element,
            // a greater element is present in the left half, move left
            if(arr[mid] > arr[mid+1]){
                peak = mid;
                r = mid - 1;
            } else {
                // (arr[mid] < arr[mid+1])
                // a greater element is present in the right half, move right
                l = mid + 1;
            }
        }

        return peak;

    }
}
