package com.viswa.binarysearch;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

        char letters[] = {'c','f','j'};
        char target = 'z';
        System.out.println(nextGreatestLetter(letters, target));
    }


    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        if (start > letters.length - 1) {
            start = 0;
        }
        return letters[start];
    }

}
