package com.viswa.arrays;

import java.util.Arrays;

public class RemoveDuplicatedFromSortedArray {
    public static void main(String[] args) {
//        https://www.naukri.com/code360/problems/remove-duplicates-from-sorted-array_1102307
        int arr[] = {5, 8, 6, 8, 78, 5, 6, 41, 66,66};
        Arrays.sort(arr);
        int i=0;
        for(int j=1;j< arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}
