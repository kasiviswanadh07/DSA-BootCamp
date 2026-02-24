package com.viswa.arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {

        int arr[] = {5, 8, 6, 8, 78, 5, 6, 41, 66};

        //brut
//        Arrays.sort(arr);
//        int sec = 0;

  /*       int largest = arr[arr.length - 1];
       for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != largest) {
                sec = arr[i];
                break;
            }
        }
        System.out.println("second largest element " + sec);*/
        //optimized problem
        int largest = arr[0];
        int slargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }
}
