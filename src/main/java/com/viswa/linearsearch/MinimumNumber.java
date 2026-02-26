package com.viswa.linearsearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 8, 7, 5, 6, 2, 66, 65};

        System.out.println(minimumNum(arr));
    }

    private static int minimumNum(int[] arr) {
        int minNum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minNum){
                minNum=arr[i];
            }
        }
        return minNum;
    }
}
