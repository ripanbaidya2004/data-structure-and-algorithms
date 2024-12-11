package com.ripan.dsa.array;

/**
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 * leetcode 53
 */
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        // to solve this problem we can use Kadane's algorithm
        // It says, if the sum of the sub-array give us negative value then don't take it
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = -1, ansStart = -1, ansEnd = -1;

        for(int i = 0; i < nums.length; i ++){
            if(currentSum == 0) start = i;
            currentSum += nums[i]; // add the current element to the maxSum

            if(currentSum > maxSum){
                maxSum = currentSum;
                ansStart = start; // store the start index
                ansEnd = i; // store the end index
            }

            if(currentSum < 0) currentSum = 0; // if the current sum is negative then dont take it and make it 0

        }
        /**
         * // if the maxSum is still negative then return 0, this will given in a question
         * if(maxSum < 0) return 0;
         */

        // print the subarray that gives us the maximum sum
        for(int i = ansStart; i <= ansEnd; i ++){
            System.out.print(nums[i]+" ");
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = new MaximumSubArray().maxSubArray(nums);
        System.out.println(ans);
    }
}
