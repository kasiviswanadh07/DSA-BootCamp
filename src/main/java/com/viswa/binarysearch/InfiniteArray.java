package com.viswa.binarysearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 13, 14};
        int target = 8;
        findAns(arr, target);
    }

    private static void findAns(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;

            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }
        }

        int result = binarySearch(arr, target, start, end);
        System.out.println(result);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        if (arr.length == 0) return -1; // important safety check


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1; // not found
    }
}
