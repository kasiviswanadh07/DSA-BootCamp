package com.viswa.arrays;

public class SecondSmallestNumber {
    public static void main(String[] args) {

        int arr[] = {5, 8, 6, 8, 78, 5, 6, 41, 66};
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest  && arr[i] < ssmallest){
                ssmallest=arr[i];
            }
        }
        System.out.println("Second smallest "+ssmallest);
    }
}
