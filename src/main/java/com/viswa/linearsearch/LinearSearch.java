package com.viswa.linearsearch;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 8, 7, 5, 6, 41, 66, 65};
        int target = 7;
        System.out.println(searchItem(arr, target));
    }

    private static int searchItem(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
