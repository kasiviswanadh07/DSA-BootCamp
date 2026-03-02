package com.viswa.arrays;

public class RotateArrayByKTimes {
    public static void main(String[] args) {

        int nums[] = {5, 8, 6, 8, 78, 5, 6, 41, 66};
    /*    int k = 3;
        k = k % arr.length - 1;

        RotateArrayByKTimes(arr, 0, arr.length - 1);
        RotateArrayByKTimes(arr, k, arr.length - 1);
        RotateArrayByKTimes(arr, 0, k - 1);
    }

    public static void RotateArrayByKTimes(int[] nums, int start, int end) {*/

    /*    for (int i = 1; i <= k; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }

            nums[0] = temp;

        }*/
   /*     while (start < end) {
            int temp = nums[nums.length - 1];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }*/
        int n = nums.length;
        int k = 3;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        for (int ele : nums) {
            System.out.print(ele + " ");
        }
    }
}

