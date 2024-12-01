package com.ripan.dsa.binarysearch;

/**
 * lowerBound: the index of the first element in the array that is greater than or equal to the target.
 * upperBound: the index of the first element in the array that is greater than the target.
 *
 * case1: if (lowerBound == upperBound) then target is not present in the array
 * case2: if(upperBound == -1) then lowerBound is present but, upperBound is not present,
 * in this case for the upperBound we need to return the (length-1) of the array
 * case3: if we find both upperBound and lowerBound. then we need to decrement the upperBound by 1
 *
 * leetcode 34
 */

public class FindLowerAndUpperBoundOfElement {

    public int lowerBound(int[] nums, int target){
        int l = 0, r = nums.length-1, ans = -1;

        // lower bound
        while(l <= r){
            int mid = (l+r)/2;
            // checking if the number is greater or equal to the target
            if(nums[mid] >= target){
                ans = mid;
                r = mid-1; // there can be a number
            } else {
                l = mid+1;
            }
        }
        return ans;
    }

    public int upperBound(int[] nums, int target){
        int l = 0, r = nums.length-1, ans = -1;

        // upper bound
        while(l <= r){
            int mid = (l+r)/2;
            // checking if the number is greater  to the target
            if(nums[mid] > target){
                ans = mid;
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        int lb = lowerBound(nums, target);
        int ub = upperBound(nums, target);
        int[] ans = new int[2];

        // check lb and ub are equal, its failure
        if(lb == ub){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }

        // cheking if the upper bound is equal to -1
        if(ub == -1){
            ans[0] = lb;
            ans[1] = nums.length-1; // this is the last element
            return ans;
        }

        // if all criteria are met
        ans[0] = lb; // lower bound
        ans[1] = ub-1; // upper bound

        return ans; // return the answer
    }
    public static void main(String[] args) {

    }
}
