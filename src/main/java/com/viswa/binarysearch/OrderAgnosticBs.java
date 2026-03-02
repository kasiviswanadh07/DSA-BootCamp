package com.viswa.binarysearch;

public class OrderAgnosticBs {
    public static void main(String[] args) {

//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int arr[] = {90, 75, 43, 43, 42, 35, 22, 21, 19};
        int target = 42;
        int index = 0;
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            System.out.println(binarySearch(arr, target));
        } else {
            System.out.println(OrderAgnosticbinarySearch(arr, target));
        }
    }

    private static int OrderAgnosticbinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
//            int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            }

        }
        return -1;
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
        return -1;

    }
}