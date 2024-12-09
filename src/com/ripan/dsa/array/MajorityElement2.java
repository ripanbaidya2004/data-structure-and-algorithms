package com.ripan.dsa.array;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
/**
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * leetcode 229
 */
public class MajorityElement2 {

    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length; // length of the array
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>(); // key: element, value: frequency

        // Put all elements along with there frequency
        for(int i = 0; i < n; i ++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }

        // Iterate over the hashmap
        // check if the frequency is greater than n/3
        for(Integer k : mp.keySet()){
            if(mp.get(k) > n/3) ans.add(k);
        }
        /**
         * tine: O(n + k) k <= n, n to put elements in the map, k to iterate over the map, in worst case it will be O(n)
         * space: O(n + n) -> hashmap takes to store n elements, so it is O(n), ans takes O(n) to return the resultg
         */
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,2,2,2};
        List<Integer> ans = new MajorityElement2().majorityElement(nums);
        System.out.println(ans);
    }
}
