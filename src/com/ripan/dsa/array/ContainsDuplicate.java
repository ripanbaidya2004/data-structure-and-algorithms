package com.ripan.dsa.array;

import java.util.Arrays;

// leetcode 217
public class ContainsDuplicate {
    /**
     * The Approach is very simple. Sort the array and check if the adjacent elements are equal
     * if there is any equal element, return true
     * or else return false.
     */
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums); // O(nlog(n))

        for(int i = 1; i < nums.length; i ++){
            if(nums[i] == nums[i-1])
                return true;
        } // O(n)

        // time: O(nlog(n)) + O(n) = O(nlog(n)), space: O(1)
        return false;
    }
}

