package com.ripan.dsa.binarysearch;

// leetcode 81
public class SearchInRotatedArray2 {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] == target) return true;

            // check if low == mid == high
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low = low + 1;
                high = high - 1;
                continue;
            }
            // if left half was sorted
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // if right half was sorted
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false; // if not found
    }
}
