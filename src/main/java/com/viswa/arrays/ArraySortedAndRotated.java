package com.viswa.arrays;

public class ArraySortedAndRotated {
//    https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 8, 78, 5, 6, 41, 66};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }
        if (count <= 1) {
            System.out.println("Array sorted and rotated");
        } else {
            System.out.println("Array NOt sorted and rotated");
        }

    }
}

