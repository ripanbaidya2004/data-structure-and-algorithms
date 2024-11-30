package com.ripan.dsa.string;

// leetcode-205

import java.util.HashMap;

public class IsomorphicString {

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> mpST = new HashMap<>(); // check for s -> t
        HashMap<Character, Character> mpTS = new HashMap<>(); // check for t -> s

        if(s.length() != t.length()){
            return false; // false if length is different
        } else {
            // traverse the string, since size is the same, so that we can pick anyone
            for(int i = 0; i < s.length(); i ++){

                char charS = s.charAt(i);
                char charT = t.charAt(i);

                // check for s -> t
                if(mpST.containsKey(charS)){
                    if(charT != mpST.get(charS)){
                        // false if value is different
                        return false;
                    }
                } else{
                    // put charS(key) and charT(value)
                    mpST.put(charS, charT);
                }

                // check for t -> s
                if(mpTS.containsKey(charT)){
                    if(charS != mpTS.get(charT)){
                        return false;
                    }
                } else{
                    mpTS.put(charT, charS);
                }
            }
        }
        return true;
    }

}
