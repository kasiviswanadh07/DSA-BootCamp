package com.viswa.binarysearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 13, 14};
        int target = 7;
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
//            int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }

        }
        return end;
        // When the conditon voileted start is the next element start so we can return the start
    }
}
