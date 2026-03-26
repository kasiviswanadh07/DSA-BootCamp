package com.viswa.binarysearch;

public class firstAndLastElementOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 8, 10};
        int target = 8;
        System.out.print(endnum(nums, target) + " ");
        System.out.print(startnum(nums, target));
    }
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static int startnum(int[] nums, int target) {
        int result = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result = mid;
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static int endnum(int[] nums, int target) {
        int result = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result = mid;
                end = mid - 1;
            } else if (target < nums[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}

