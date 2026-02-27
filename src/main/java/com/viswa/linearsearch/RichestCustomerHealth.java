package com.viswa.linearsearch;

public class RichestCustomerHealth {

    //    https://leetcode.com/problems/richest-customer-wealth/description/
    public static void main(String[] args) {
        int arr[][] = {
                {6, 5, 60},
                {3, 6, 20}
        };
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < arr.length; person++) {
            int rowSum = 0;
            for (int account = 0; account < arr[person].length; account++) {
                rowSum += arr[person][account];
            }
            if (max <= rowSum) {
                max = rowSum;
            }
        }
        System.out.println(max);
    }
}
