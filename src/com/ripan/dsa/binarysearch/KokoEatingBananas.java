package com.ripan.dsa.binarysearch;

// leetcode 875
public class KokoEatingBananas {
    // find the max
    public int findMax(int[] a){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i ++){
            maxi = Math.max(maxi, a[i]);
        }
        return maxi;
    }

    public int countTotalHours(int[] a, int hourly){
        int totalH = 0;
        for(int i = 0; i < a.length; i ++){
            totalH += Math.ceil((double)(a[i])/(double)(hourly));
        }
        return totalH;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = findMax(piles);

        while(low<= high){
            int mid = (low+high)/2;
            int totalH = countTotalHours(piles, mid);

            if(totalH <= h){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
        // time: O(nlog(max(piles)))
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;

        int result = new KokoEatingBananas().minEatingSpeed(piles, h);
        System.out.println(result);
    }
}
