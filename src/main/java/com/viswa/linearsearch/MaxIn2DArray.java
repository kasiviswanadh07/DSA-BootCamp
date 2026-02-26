package com.viswa.linearsearch;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {
                {34, 53, 63, 23, 63, 23},
                {3, 56, 46, 73, 6, 24},
                {3, 2, 6, 34, 93, 5},
                {35, 64, 32, 29}
        };
        System.out.println(MaxIn2DArray(arr));
    }

    private static int MaxIn2DArray(int[][] arr) {
        int max = arr[0][0];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] > max) {
                    max = arr[r][c];
                }
            }
        }
        return max;
    }
}
