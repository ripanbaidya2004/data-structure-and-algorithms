package com.ripan.dsa.binarysearch;

/**
 * n√m find the n'th root of m
 * n = 2, m = 9
 * 1 * 1 = false
 * 2 * 2 = 4 false
 * 3 * 3 = 9 true, so 3 is the root
 *
 * eg.2
 * n = 3, m = 64
 * 1 * 1 * 1 = 1 false
 * 2 * 2 * 2 = 8 false
 * 3 * 3 * 3 = 27 false
 * 4 * 4 * 4 = 64 true so 4 is the root
 */
public class FindNthRoot {
    // give the power of i, n
    public int getIthRoot(int i, int n){
        return(int) Math.pow(i, n);
    }

    public int nthRoot(int n, int m) {
        int low = 1;
        int high = m;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(getIthRoot(mid, n) == m){
                return mid;
            } else if(getIthRoot(mid, n) < m){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 64;

        int ans = new FindNthRoot().nthRoot(n, m);
        System.out.println(ans);
    }
}
