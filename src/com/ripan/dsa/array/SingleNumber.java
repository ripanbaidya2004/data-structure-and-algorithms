package com.ripan.dsa.array;

// leetcode 136
// find the number that appear once and other twice
public class SingleNumber {

    // we can use XOR between the numbers.
    // O(n), space: O(1)
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i ++){
            ans ^= nums[i];
        }
        return ans;
    }
}
