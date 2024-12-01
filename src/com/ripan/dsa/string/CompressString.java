package com.ripan.dsa.string;

// leetcode 443
public class CompressString {

    public int compress(char[] chars) {
        int write = 0; // position to write the compressed data
        int read = 0; // position to start reading character

        while(read < chars.length){
            char currentChar = chars[read];
            int count = 0;

            // Count the occurrences of the current character
            while(read < chars.length && currentChar == chars[read]){
                read ++;
                count ++;
            }

            // write the character
            chars[write++] = currentChar;

            // write count if it is greater than 1
            if(count > 1){
                // convert the count to string
                String countStr = Integer.toString(count);

                // traverse through the count, by converting the string to char array
                for(char ch : countStr.toCharArray()){
                    chars[write++] = ch;
                }
            }
        }

        return write; // return the write value, this is the length
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        System.out.println(new CompressString().compress(chars));
    }
}
