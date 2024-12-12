package com.ripan.dsa.string;

/**
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * leetcode 14
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return ""; // handling the edge case

        StringBuilder ans = new StringBuilder();
        String firstS = strs[0];

        for(int i = 0; i < firstS.length(); i ++){
            // Iterate over each character of the first string
            char ch = firstS.charAt(i);

            // Check this character against all other strings
            for(int j = 1; j < strs.length; j ++){
                // If we reach the end of any string or characters do not match
                if(i >= strs[j].length() || ch != strs[j].charAt(i)){
                    return ans.toString();
                }
            }
            // If all strings have the same character at index i, append it
            ans.append(ch);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        String ans = new LongestCommonPrefix().longestCommonPrefix(strs);
        System.out.println(ans);
    }
}
