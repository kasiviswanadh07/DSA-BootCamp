package com.viswa.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 8, 2, 5, 6, 41,66};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("largets elemnet "+largest);
    }
}
