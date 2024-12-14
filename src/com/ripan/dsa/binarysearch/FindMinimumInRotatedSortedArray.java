package com.ripan.dsa.binarysearch;

// leetcode 153
public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mini = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[low] <= arr[mid]){
                // left half is sorted
                // take the min from the left half, which would at index low
                mini = Math.min(mini, arr[low]);
                // eliminate the left half
                low = mid + 1;

            } else{
                // right half is sorted
                // take the min from the right half, which would at index mid
                mini = Math.min(mini, arr[mid]);
                // eliminate the right half
                high = mid - 1;
            }
        }
        return mini;
    }
}
