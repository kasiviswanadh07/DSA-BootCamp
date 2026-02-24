package com.viswa.arrays;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 8, 78, 5, 6, 41, 66};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i-1]) {
            } else {
                System.out.println("Not sorted Array ");
                return;
            }

        }
        System.out.println("Sorted Array ");
    }
}
