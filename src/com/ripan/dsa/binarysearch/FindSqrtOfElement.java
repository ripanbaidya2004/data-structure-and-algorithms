package com.ripan.dsa.binarysearch;

/**
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 *
 * leetcode 69
 */
public class FindSqrtOfElement {

    public static int mySqrt(int x) {
        // to solve this problem, we can use the binary search algorithm
        long l = 0; // starting
        long r = x; // ending
        int ans = 0;

        while(l <= r){
            long mid = l + (r-l)/2;

            // square root of mid
            if((mid*mid) <= x){
                ans = (int)mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int x = 4;
        int result = mySqrt(x);
        System.out.println(result);
    }
}
