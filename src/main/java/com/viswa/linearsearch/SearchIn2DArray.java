package com.viswa.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {
                {34, 53, 63, 23, 63, 23},
                {3, 56, 46, 73, 6, 24},
                {3, 2, 6, 34, 73, 5},
                {35, 64, 32, 29}
        };
        int target =5;
        int res[] = searchIn2DArray(arr, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] searchIn2DArray(int[][] arr, int target) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == target) {
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
