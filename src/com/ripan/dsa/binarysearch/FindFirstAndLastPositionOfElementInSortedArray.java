package com.ripan.dsa.binarysearch;

import java.util.Arrays;

/**
 * leetcode 34
 */

public class FindFirstAndLastPositionOfElementInSortedArray {

    // This will calculate the first index of the element, where it appears.
    public int firstI(int[] nums, int target){
        int fI = -1; // first index
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] == target){
                fI = mid;
                high = mid - 1; // must on the left side
            } else if(nums[mid] < target){
                low = mid + 1;
            } else { // num > target
                high = mid - 1;
            }
        }
        return fI;
    }

    // This will calculate the last index of the element, where it appears.
    public int lastI(int[] nums, int target){
        int lI = -1; // last index
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] == target){
                lI = mid;
                low = mid + 1; // must on the right side
            } else if(nums[mid] < target){
                low = mid + 1;
            } else{ // num > target
                high = mid - 1;
            }
        }
        return lI;
    }

    public int[] searchRange(int[] nums, int target) {
        int ansFirstI = firstI(nums, target);
        int anslastI =  lastI(nums, target);

        // time: O(log n) + O(log n) => O(2 log n) => O(log n)
        // space: O(1)
        return new int[] {ansFirstI, anslastI};
    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;

        int[] ans = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(arr, target);

        System.out.println(Arrays.toString(ans));
    }
}
