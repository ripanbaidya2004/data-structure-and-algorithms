package com.ripan.dsa.string;

import java.util.Arrays;

/**
 * sort the string
 *  by default String isn't providing any inbuilt function to sort it.
 *  we need to create a char array and store the string into it
 *  then sort the char array
 */
public class ReverseString {
    public static void main(String[] args) {

        // for String
        String s = "edcba"; // abcde

        char[] correspondingCharArrayForString = s.toCharArray();
        Arrays.sort(correspondingCharArrayForString);

        // for StringBuilder
        StringBuilder sb = new StringBuilder("edcba"); // abcde

        char[] correspondingCharArrayForStringBuilder = sb.toString().toCharArray();
        Arrays.sort(correspondingCharArrayForStringBuilder);

    }
}
