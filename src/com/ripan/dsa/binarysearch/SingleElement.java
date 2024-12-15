package com.ripan.dsa.binarysearch;

/**
 * Input: nums = [1,1,2,3,3,4,4,8,8]
 * Output: 2
 * leetcode 540
 */
public class SingleElement {

    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0]; // if array has only one element, return that element
        if(nums[0] != nums[1]) return nums[0]; // if first element is different from second element, return the first element
        if(nums[n-1] != nums[n-2]) return nums[n-1]; // if last element is different from second last element, return the last element

        int low = 1, high = n-2;

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid]; // if middle element is not equal to its adjacent elements, return the middle element
            if((mid % 2 == 1)&&nums[mid]==nums[mid-1] || (mid % 2 == 0)&&nums[mid] == nums[mid+1])
                low = mid + 1; // if middle element is equal to its adjacent elements, move to the right
            else
                high = mid - 1; // if middle element is equal to its adjacent elements, move to the left
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(new SingleElement().singleNonDuplicate(nums));
    }
}
