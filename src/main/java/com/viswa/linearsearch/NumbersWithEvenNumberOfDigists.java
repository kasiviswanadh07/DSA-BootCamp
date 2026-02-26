package com.viswa.linearsearch;

public class NumbersWithEvenNumberOfDigists {
    public static void main(String[] args) {
        int nums[] = {234, 63, 74, 234, 6457, 8434, 5752, 2457, 46};
        int countEven = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = lengthNum(nums[i]);
            if (num % 2 == 0)
                countEven++;
        }
        System.out.println(countEven);
    }

    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    static int lengthNum(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}

