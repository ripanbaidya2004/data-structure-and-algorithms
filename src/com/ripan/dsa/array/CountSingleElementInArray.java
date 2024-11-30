package com.ripan.dsa.array;

import java.util.HashMap;

// leetcode 540

public class CountSingleElementInArray {

    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0 ; i < nums.length; i ++){
            int frequency = mp.getOrDefault(nums[i], 0);
            mp.put(nums[i], frequency + 1);
        }
        for(Integer r : mp.keySet()){
            if(mp.get(r) == 1)
                return r;
        }
        return -1;
    }

}
