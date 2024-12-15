package com.ripan.dsa.binarysearch;

// leetcode 162
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        if(n == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;

        int low = 1, high = n-2;

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            else if(nums[mid] < nums[mid+1]){
                low = mid + 1; // peak must be in right side
            } else if(nums[mid] < nums[mid-1]){
                high = mid - 1; // peak must be in left side
            } else {
                // if it is in the down
                // move eiter left or right
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(new FindPeakElement().findPeakElement(nums));
    }
}
