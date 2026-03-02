package com.viswa.arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {


        int arr[] = {5, 8, 6, 8, 78, 5, 6, 41, 66};
        rotate(arr);
    }

    public static void rotate(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;

        for (int ele : nums) {
            System.out.print(ele + " ");
        }
    }
}
