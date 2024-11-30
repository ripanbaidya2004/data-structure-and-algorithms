package com.ripan.dsa.array;
// find the majority element which appears more than n/2 times
import java.util.HashMap;
import java.util.Map;

// leetcode 169
public class MajorityElement {

    public static int majorityElementUsingHashing(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i ++) // O(NlogM)
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

        for(Map.Entry<Integer, Integer> it : map.entrySet()){ // O(N)
            if(it.getValue() > (n/2))
                return it.getKey();
        }
        // time: O(NlogM) + O(N)  space:O(N)
        return -1;
    }

    public static int majorityElementUsingMooresVotingAlgorithm(int[] arr) {
        int element = 0, count = 0;
        for(int i=0; i < arr.length; i ++){
            int currentElement = arr[i];
            if(count == 0){
                element = currentElement;
                count ++;
            }
            if(element == currentElement)
                count ++;
            else
                count --;
        }
        // again need to check whether the element is actually greatest or not. if question doesn't gurrantee for the majority element
        int count2 = 0;
        for(int i= 0; i < arr.length ; i ++){
            if(arr[i] == element)
                count2 ++;
        }
        if(count2 > arr.length/2)
            return element;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 1, 2, 2};

//        int majorityElement = majorityElementUsingHashing(arr);
        int majorityElement = majorityElementUsingMooresVotingAlgorithm(arr);
        System.out.println(majorityElement);
    }
}
