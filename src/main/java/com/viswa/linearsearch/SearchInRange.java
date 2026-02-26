package com.viswa.linearsearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 8, 7, 5, 6, 41, 66, 65};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the from Range, to Range and Target");
        int from = sc.nextInt();
        int to = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(searchInRange(arr, from, to, target));
    }

    private static boolean searchInRange(int[] arr, int from, int to, int target) {
        if (arr.length == 0 || to == 0 || to < from) {
            return false;
        }
        for (int i = from; i <= to; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
