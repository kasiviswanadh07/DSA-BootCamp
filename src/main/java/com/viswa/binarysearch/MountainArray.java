package com.viswa.binarysearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/submissions/1966181265/

public class MountainArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9, 10, 3, 9, 12};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Mountain Element " + arr[end]);
    }
}
